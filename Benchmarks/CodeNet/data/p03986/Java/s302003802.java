import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String x = sc.next();
		int n = 0;
		int m = 0;
		
		for (int i=0; i<x.length(); i++) {
			if (x.charAt(i)=='T') n++;
			else break;
		}
		
		for (int i=x.length()-1; i>=0; i--) {
			if (x.charAt(i)=='S') m++;
			else break;
		}
		
		sc.close();
		
		System.out.printf("%d\n", Math.max(n, m)*2);
	}
}