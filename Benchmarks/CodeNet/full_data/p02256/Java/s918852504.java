import java.util.*;
import java.io.*;
class Main{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out, true);
		int a=in.nextInt();
		int b=in.nextInt();
		out.println(gcd(a, b));
	}

	public static int gcd(int a,int  b){
		if(a==0)
			return b;
		return gcd(b%a, a);
	}
}
