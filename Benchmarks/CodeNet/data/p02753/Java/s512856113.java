import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = A + B;
      
      if(A==0&&B==0) {
			System.out.println(0);
		}
      
		int D = N % C;
		int E = N / C;

		int ans = E*A;

		if(B <= D) {
			ans += B;
		}else {
			ans += D;
		}
		System.out.println(ans);
	}
}