import java.util.Scanner;
 
public class Main {
 
	public static final MyScanner in = new MyScanner();

	public static void main(String[] args) {

		char[] S = in.next().toCharArray();
		long cnt = 0;
		for(int i=0; i < S.length - 3; i++) {
			long num = ((int)S[i]-48) * 1000
					+ ((int)S[i+1]-48) * 100
					+ ((int)S[i+2]-48) * 10
					+ ((int)S[i+3]-48);
			if(num % 2019 == 0) cnt++;
			for(int j=i+4; j < S.length; j++) {
				num = num*10 +  ((int)S[j]-48);
				if(num % 2019 == 0) cnt++;
			}
		}
		System.out.println(cnt);

	}



	public static class MyScanner {
		Scanner sc = new Scanner(System.in);
		String next() { return sc.next();}
		int nextInt() { return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next()); }
	}
}