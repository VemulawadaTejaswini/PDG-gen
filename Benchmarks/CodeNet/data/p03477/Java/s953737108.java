import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		if (A + B > C + D) {
			System.out.print("Left");
		}else if(A + B == C + D) {
			System.out.print("Balanced");			
		}else {
			System.out.print("Right");
		}
	}
}
