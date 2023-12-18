import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Integer n=Integer.valueOf(new Scanner(System.in).nextLine());
		double even=0;
		for(int i=1;i<=n;i++) {
			even+=i%2==0?0:1;
		}
		System.out.println(even/n);
	}
}