package GlobalSign;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void printPrimes(int no) {
		int cnt = 0;
		for(int i=2;i<=no;i++) {
			if(isPrime(i))
				cnt++;
		}
		System.out.println(cnt);
	}
	
	public static void main(String[] a) throws NumberFormatException, IOException {
		if(a.length == 0) {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			printPrimes(Integer.parseInt(br.readLine()));
		}
		else {
		for(int i=0;i<a.length;i++) {
			int no = Integer.parseInt(a[i]);
			printPrimes(no);
		}
		}
	}

	public static boolean isPrime(int no) {
		// TODO Auto-generated method stub
		int m = no/2;
		boolean p = true;
		for(int i=2;i<=m;i++) {
			if(no%i==0)
				p = false;
		}
		return p;
	}
}