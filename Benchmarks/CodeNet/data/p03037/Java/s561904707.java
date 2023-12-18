import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N  = keyboard.nextInt();
		int M  = keyboard.nextInt();
		
		 int[] L = new int[M];
		 int[] R = new int[M];
		
		for(int i = 0; i < M ; i++) {
			L[i] = keyboard.nextInt();
			R[i] = keyboard.nextInt();
		}
		int min = 0;
		int MAX = 0;
		int[] count = new int[N];
		
		for(int j = 0; j < M ; j++) {
			min = L[j];
			MAX = R[j];
			
			for(int k = 0; k < N; k++) {
				if(k+1 >= min && k+1 <= MAX) {
					count[k] ++;
					}
			}	
		}
		
		int ans = 0;
		
		for(int l = 0; l < N; l++) {
			if(count[l] == M) {
				ans ++;
			}
		}
		
		System.out.println(ans);
		keyboard.close();	
	}
}
