import java.util.ArrayList;
import java.util.List;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Main {

	static final int MAX = 10000;

	public static void main(String[] args) {

		int primecount = 0;
		Input stdIn = new Input();

		int n = stdIn.getValue();

		List<Integer> values = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			values.add(stdIn.getValue());
		}

//		List<Integer> primeList = createPrimeList(MAX);
//		System.out.println(primeList);
//		System.out.println(primeList.size());

		for(int i = 0; i < n; i++) {
//			System.out.println("values[i] :" + values.get(i));
			if(checkPrime(values.get(i))) {
				primecount++;
			}
		}

		System.out.println(primecount);

		stdIn.close();
	}

	public static boolean checkPrime(int n) {
		boolean b = true;
		if(n == 1) {
			return b;
		} else if(n == 2) {
			return b;
		} else if(n % 2 ==0) {
			return false;
		}

		for(int i = 3; i <= Math.sqrt(n); i += 2) {
			if(n % i == 0) {
				b = false;
			}
		}
		return b;
	}

	public static List<Integer> createPrimeList(int max) {

		List<Integer> primeList = new ArrayList<>();
		primeList.add(2);

		for(int i = 3; i < max; i += 2) {
			boolean b = true;
			for(int j = 3; j <= Math.sqrt(i); j += 2) {
				if(i % j == 0) {
					b = false;
				}
			}
			if(b) {
				primeList.add(i);
			}
		}
		return primeList;
	}
}
class Input{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public Input() {
	}

	public int getValue() {
		int n = 0;
		try {
			n = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return n;
	}

	public List<Integer> getLine() {
		try {
			String[] s = br.readLine().trim().split(" ");
			List<Integer> ary = new ArrayList<>();
			for (int i = 0; i < s.length; i++) {
				ary.add(Integer.parseInt(s[i]));
			}
			return ary;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void close() {
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}