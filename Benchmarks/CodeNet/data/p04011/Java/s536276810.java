import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,k,x,y ;
		n = sc.nextInt();
		k = sc.nextInt();
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println((k*x)+((n-k+1)*y));
	}
}
