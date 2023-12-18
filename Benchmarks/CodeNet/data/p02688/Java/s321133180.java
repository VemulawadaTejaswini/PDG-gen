import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N= keyboard.nextInt();
		int K= keyboard.nextInt();
		int[][] da = new int[K+1][N+1];
		int[] okashi = new int[N+1];
		
		for(int k=1; k<K+1; k++) {
			da[k][0]= keyboard.nextInt();
			for(int a=1; a<da[k][0]+1; a++) {
				da[k][a] = keyboard.nextInt();
				okashi[da[k][a]]++;
			}
		}
		
		int ans =0;
		for(int i=1; i<N+1; i++) {
			if(okashi[i] == 0) {
				ans++;
			}
		}
		
		System.out.println(ans);
		keyboard.close();	
		
	}
}