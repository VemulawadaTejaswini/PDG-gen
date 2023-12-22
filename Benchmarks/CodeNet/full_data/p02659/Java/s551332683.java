import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		double B = sc.nextDouble();
		double ans = Math.floor(A*B);
		System.out.println((long)ans);
	}
}