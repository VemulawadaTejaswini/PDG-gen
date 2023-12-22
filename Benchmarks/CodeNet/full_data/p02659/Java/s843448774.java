import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		double B = sc.nextDouble();
		double C = A * B;
		long ans = (long)Math.floor(C);
		System.out.println(ans);
	}
}