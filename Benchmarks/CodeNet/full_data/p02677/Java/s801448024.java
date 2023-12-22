import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int H = sc.nextInt();
		int M = sc.nextInt();
		double radB = M * 60.0;
		double radA = 30.0 * H + 30 * (radB / 360.0);
		double C = Math.PI * (Math.abs(radA - radB) / 180.0);
		double ans = Math.sqrt(A * A + B * B - 2 * A * B * Math.cos(C));
		System.out.println(ans);
	}
}