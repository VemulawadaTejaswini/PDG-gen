import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int X  = keyboard.nextInt();
		int N  = keyboard.nextInt();
		
		int p;
		int[] hako  = new int[101];
		
		int ans = 0;
		
		for(int i=0; i<N; i++) {
			p = keyboard.nextInt();
			hako[p] = 1;
		}
		
		for(int j=0; j<=100; j++) {
			if(X-j >=0 && hako[X-j] == 0){
				ans = X-j;
				break;
			} 
			else {
				if(X+j <=100 && hako[X+j] == 0){
					ans = X+j;
					break;
				}
			}
		}
		
		System.out.print(ans);
		keyboard.close();	
	}
}
