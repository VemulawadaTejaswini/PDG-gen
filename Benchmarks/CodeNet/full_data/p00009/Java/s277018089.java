import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static int countPrime(int n){
		int cnt = 0;
		boolean isPrime = true;
		int i, j;
		if(n < 2){
			cnt = 0;
			return cnt;
		}
		if(n == 2){
			cnt++;
			return cnt;
		}
		if(n > 2)cnt++;
		for(i = 3; i <= n; i += 2){
			for(j = 3; j <= Math.sqrt(i); j += 2){
				if(i % j == 0){
					isPrime = false;
					break;
				}
			}
			if(isPrime){
				cnt++;
			} else {
				isPrime = true;
			}
		}
		return cnt;
	}

	public static void main(String[] args){
		List<Integer> list = new ArrayList<Integer>();
		int n = scan.nextInt();
		int cnt = countPrime(n);
		list.add(cnt);

		for(int c : list){
			System.out.printf("%d\n", n);
		}
	}
}