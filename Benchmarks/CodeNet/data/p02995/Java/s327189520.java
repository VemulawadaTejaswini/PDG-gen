
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long a = in.nextLong();
		long b = in.nextLong();
		int c = in.nextInt();
		int d = in.nextInt();
		long cd = (long)c * (long)d / gcd(c,d);
		long ans_a = (a-1)/c + (a-1)/d - (a-1)/cd;
		long ans_b = b/c + b/d - b/cd;
		System.out.println(b-a+1-ans_b+ans_a);
		in.close();

	}
	
	//return gcd O(logN)
	public static int gcd(int num1,int num2) {
		if(num2==0) return num1;
		else return gcd(num2,num1%num2);
	}

}
