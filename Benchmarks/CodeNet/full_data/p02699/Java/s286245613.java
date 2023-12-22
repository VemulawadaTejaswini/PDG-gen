package atcoder;

import java.util.Scanner;

public class Main {
	static int S;
	static int W;
	public static void Main(String args[]) {
		Scanner sc=new Scanner(System.in);
		S=sc.nextInt();
		W=sc.nextInt();
		if(S>W) {
			System.out.println("safe");
		}
		else {
			System.out.println("unsafe");
		}
	}
}
