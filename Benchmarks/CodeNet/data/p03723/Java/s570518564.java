import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();
		if(A == B && B == C && A % 2 == 0) System.out.println(-1);
		else {
			int cnt = 0;
			while(A % 2 == 0 && B % 2 == 0 && C % 2 == 0) {
				int half_A = A / 2, half_B = B / 2, half_C = C / 2;
				A = half_B + half_C;
				B = half_A + half_C;
				C = half_A + half_B;
				cnt++;
			}
			System.out.println(cnt);
		}
	}
}
