import java.util.Scanner;
class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner (System.in);
		double A = scan.nextDouble();
		double B = scan.nextDouble();
		double ans = Math.floor(A*B);
		long ans_2 = (long)ans;
		System.out.println(ans_2);
	}
}
