import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner io = new Scanner(System.in);
		int A = io.nextInt();
		int B = io.nextInt();
		int C = io.nextInt();
		
		int ab = Math.abs(A-B);
		int bc = Math.abs(B-C);
		int ca = Math.abs(C-A);
		
		int ans = 0;
		if(ab==0 && bc==0 && ca==0){
			System.out.println(-1); return;
		}
		while(ab%2==0 && bc%2==0 && ca%2==0){
			ab /= 2;
			bc /= 2;
			ca /= 2;
			ans ++;
		}
		System.out.println(ans);
		
	}
}
