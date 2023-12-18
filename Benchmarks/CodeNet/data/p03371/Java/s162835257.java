
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();

		sc.close();
		int ans = 0;
		if((A+B) <= 2*C){
			ans = A*X + B*Y;
		}
		else{
			ans = Math.min(X, Y) * 2 * C;
			if(X-Y == 0){
				System.out.println(ans);
			}
			else if(X-Y>0){
				if(A/2 > C){
					ans += (X-Y)*C*2;
				}
				else{
					ans += (X-Y)*A;
				}
			}
			else{
				if(B/2 > C){
					ans += (Y-X)*C*2;
				}
				else{
					ans += (Y-X)*B;
				}
			}
		}
		System.out.println(ans);
	}

}