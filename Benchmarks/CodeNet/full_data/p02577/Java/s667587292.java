//package abc176;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	static PrintWriter out;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		out=new PrintWriter(System.out);
		
		String string=sc.next();
		int sum=0;
		for(int i=0;i<string.length();i++) {
			sum+=string.charAt(i)-'0';
		}
		if(sum%9==0) {
			out.print("Yes");
		}
		else {
			out.print("No");
		}
		
		out.close();
		sc.close();
	}

}
