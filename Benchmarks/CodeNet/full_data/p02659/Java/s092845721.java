import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n = sc.nextLong();
		double m = sc.nextDouble();
		int temp = (int)m*100;
		long temp2=temp*n;
		System.out.println(temp2/100);
	}
}