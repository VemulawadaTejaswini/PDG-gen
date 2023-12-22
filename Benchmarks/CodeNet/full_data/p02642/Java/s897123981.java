import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			Prime prime = new Prime(1000000);
			int n = sc.nextInt();

			ArrayList<Integer> list = new ArrayList<>();
			int[] numCount = new int[1000001];
			for (int i = 0; i < n; i++) {
				int value = sc.nextInt();
				numCount[value]++;
				if (value == 1) {
					System.out.println(0);
					return;
				}
				list.add(value);
			}

			Collections.sort(list);
			Collections.reverse(list);

			int count = 0;
			for (int i = 0; i < n; i++) {


				if (numCount[list.get(i)] >1) {
					continue;
				}
				
				if(prime.isPrime(list.get(i))) {
					count++;
					continue;
				}

				boolean flag = true;
				for (int j = i + 1; j < n; j++) {

					if (list.get(i) % list.get(j) == 0) {
						flag = false;
						break;
					}
				}

				if (flag)
					count++;

			}

			System.out.println(count);

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}

class Prime {
	public ArrayList<Long> primes = new ArrayList<>();
	public long max;

	public Prime(long max) {
		this.max = max;
		primes.add(2l);
		for (long i = 3; i <= max; i += 2) {
			if (isPrime(i))
				primes.add(i);
		}
	}

	public boolean isPrime(long value) {
		if (value <= 1l) {
			return false;
		} else if (value == 2l) {
			return true;
		}

		boolean flag = true;
		for (long i = 3l; i * i <= value; i += 2l) {
			if (value % i == 0) {
				flag = false;
				break;
			}
		}

		return flag;
	}

	public HashMap<Long,Integer> primeFact(long value){
		HashMap<Long,Integer> returns = new HashMap<>();
		int i = 0;
		int count = 0;
		if(primes.contains(value)) {
			returns.put(value, 1);
			return returns;
		}

		while(true) {
			if(value % primes.get(i) == 0) {
				count++;
				value /= primes.get(i);
			}else {
				if(count !=0) {
					returns.put(primes.get(i), count);
				}

				i++;
				count = 0;
			}

			if(value == 1) {
				returns.put(primes.get(i), count);
				break;
			}
		}


		return returns;
	}
}