import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int H = sc.nextInt();
		int M = sc.nextInt();
		int angleH = 0;
		int angleM = 0;
		angleH = H * 30;
		System.out.println(angleH);
		angleM = M * 6;
		System.out.println(angleM);
		int angle = angleH - angleM;
		double ans = Math.sqrt(Math.pow(A,2) + Math.pow(B,2) - 2 * A * B * Math.cos(Math.toRadians(angle)));
		System.out.print(ans);
	}
}