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
		
		int min = L[0];
		int MAX = R[0];
		int ans = 0;
		
		for(int m = 0; m < M; m++) {
			
			if(min <= L[m]) {
				min = L[m];
			}
			if(MAX >= R[m]) {
				MAX = R[m];
			}
		}
		
		ans = MAX - min + 1;
		ans = Math.max(ans, 0);
		
		System.out.println(ans);
		keyboard.close();	
	}
}
