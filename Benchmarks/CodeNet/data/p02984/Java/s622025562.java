import java.util.Scanner;

public class Main {
	public static void main(String[] args){
			
			Scanner input = new Scanner(System.in);
			int N = input.nextInt();
			int[] A = new int[N];
			for(int i = 0; i<N; i++){
				A[i] = input.nextInt();
			}
			
			int[] ans = new int[N];
			ans[0] = 0;
			for(int i = 0; i<N; i++){
				ans[0] = (int)(ans[0]+A[i]*Math.pow(-1, i));
			}
			System.out.println(ans[0]);
			for(int i=1; i<N; i++){
				ans[i] = 2* A[i-1] - ans[i-1];
				System.out.println(" ");
				System.out.println(ans[i]);
			}
	}
}
