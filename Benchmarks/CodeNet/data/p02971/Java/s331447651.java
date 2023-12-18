import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N = keyboard.nextInt();
		int[]A = new int[N];
		
		for(int i=0; i<N; i++) {
			A[i] = keyboard.nextInt();
		}
		
		int[] ans = new int[N];
		for(int j=0; j<N; j++) {
			int Max = 0;
			for(int k=0; k<N; k++) {
				if(j != k) {
					Max = A[k]>Max ? A[k]: Max;
				}
			}
			ans[j] = Max;
		}
		
		for(int l=0; l<N; l++) {
			System.out.println(ans[l]);
		}
		keyboard.close();	
	}
}
