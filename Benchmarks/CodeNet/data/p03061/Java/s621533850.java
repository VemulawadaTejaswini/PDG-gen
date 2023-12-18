import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N = keyboard.nextInt();
		int[] A = new int[N];
		for(int i=0; i < N; i++) {
			A[i] = keyboard.nextInt();
		}
		Arrays.sort(A);
		
		int solve = 0;
		int[] count = new int[1000000001];
		
		for(int j=0; j < N; j++) {
			for(int j2 = 0; j2 < N; j2++) {
				solve =yaku(A[j],A[j2]);
				count[solve] = count[solve] +1;
			}
      }
		
		int Max = 2;
		for(int l = 2; l < N +1; l++) {
			 if(count[l] > count[l-1]) {
				Max = l;
			}
		}
		
		System.out.println(Max);
		keyboard.close();
	}


	public static int yaku(int m, int n) {
		if(m < n) {
			return yaku(n, m);
		}
		if(n == 0) {
			return m;
		}
		return yaku(n, m % n);
	}
}
