import java.util.Scanner;

public class Buttons {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int ans = 0;
		for(int i = 0; i < 2; i++) {
			if(A>B) {
				ans += A;
				A -= 1;
			}else {
				ans += B;
				A -= 1;
			}
			
		}
		System.out.println(ans);
	}

}
