import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int H = keyboard.nextInt();
		int W = keyboard.nextInt();
		int count = keyboard.nextInt();
		int[][]M = new int[H+1][W+1];
		int[]sumH = new int[H+1];
		int[]sumW = new int[W+1];
		
		int SH = 0;
		int SW = 0;
		
		for(int i = 0; i<count; i++) {
			int inH = keyboard.nextInt();
			int inW = keyboard.nextInt();
			M[inH][inW] = 9;
			sumH[inH] ++;
			sumW[inW] ++;
			
			if(sumH[inH]>= SH) {
				SH = inH;
			} 
			if(sumW[inW]>= SW) {
				SW = inW;
			}
		}
		int ans = 0;
		if(M[SH][SW] == 9) {
			 ans = sumH[SH]+sumW[SW]-1;
		}else {
			ans = sumH[SH]+sumW[SW];
		}
		
		System.out.print(ans);
		keyboard.close();
	}
}