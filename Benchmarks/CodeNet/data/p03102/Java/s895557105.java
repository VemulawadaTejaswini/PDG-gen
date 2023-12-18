import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N  = keyboard.nextInt();
		int M = keyboard.nextInt();
		int C = keyboard.nextInt();
		
		int[]B = new int[M];
		for(int i=0; i<M; i++){
			B[i] = keyboard.nextInt();
		}
		
		int[][]A = new int[N][M];
		for(int j=0; j<N; j++){
			for(int k=0; k<M; k++){
				A[j][k] = keyboard.nextInt();
			}
		}
		
		int culc = 0;
		int ans = 0;
		
		for(int n=0; n<N; n++){
			culc = 0;
			for(int m=0; m<M; m++){
				culc += A[n][m]*B[m];
				}
			if(culc+C>0){
				ans++;
			}
		}
		
		System.out.println(ans);
		keyboard.close();	
	}
}