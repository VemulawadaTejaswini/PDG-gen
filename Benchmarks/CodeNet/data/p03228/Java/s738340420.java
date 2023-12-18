import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int K = sc.nextInt();
		sc.close();
		int turn = 1;
		for(int i = 0; i < K; i++) {
			if(turn == 1) {
				if(A % 2 == 1) {
					A--;
				}
				A /= 2;
				B += A;
			}else {
				if(B % 2 == 1) {
					B--;
				}
				B /= 2;
				A += B;
			}
			turn *= -1;
		}
		System.out.println(A +" " + B);
	}
}