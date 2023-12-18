import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(), B = sc.nextInt(), AB = sc.nextInt(),
				X = sc.nextInt(), Y = sc.nextInt();
		
		if((A+B) >= AB * 2) {
			if(A >= AB * 2 && B >= AB * 2) {
				System.out.println(AB*Math.max(X, Y) * 2);
			}else {
				System.out.println(((AB*Math.min(X, Y) * 2) + (Math.abs(X - Y) * Math.min(A, B))));
			}
		}else {
			System.out.println(A * X + B * Y);
		}
		

	}

}