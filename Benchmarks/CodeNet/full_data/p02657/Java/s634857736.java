import java.util.Scanner;
 
public class A168 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n =sc.nextLong();
		int f = (int)Math.floor((double)100*sc.nextDouble());
		long temp = n*f;
		temp/=(long)100;
		System.out.println(temp);
	}
}