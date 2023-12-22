import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n == 0 )break;
			else calc(n);
			
		}
	}
	public void calc(int n){
		int[] count = new int[7];
		int[][] numMemo = new int[201][201];
		int[][] highMemo = new int[201][201];
		int nowX = 100;
		int nowY = 100;
		
		int[][] right = new int[7][7];
		right[1][2] = 3; right[1][3] = 5; right[1][4] = 2; right[1][5] = 4;
		right[2][1] = 4; right[2][3] = 1; right[2][4] = 6; right[2][6] = 3;
		right[3][1] = 2; right[3][2] = 6; right[3][5] = 1; right[3][6] = 5;
		right[4][1] = 5; right[4][2] = 1; right[4][5] = 6; right[4][6] = 2;
		right[5][1] = 3; right[5][3] = 6; right[5][4] = 1; right[5][6] = 4;
		right[6][2] = 4; right[6][3] = 2; right[6][4] = 5; right[6][5] = 3;
		
		for(int i = 0; i < n; i++){
			int t = sc.nextInt();
			int f = sc.nextInt();
			
			int nX = nowX;
			int nY = nowY;
			
			int nH = highMemo[nX][nY];
			
			boolean hantei = true;
			
			while(hantei){
				int nextX = 0;
				int nextY = 0;
				int nextB = 0;
				int nextF = 0;
				
				if(highMemo[nX+1][nY] < nH && nextB < right[t][f] && right[t][f] >= 4){
					nextX = nX + 1;
					nextY = nY;
					nextB = right[t][f];
					nextF = f;
				}
				if(highMemo[nX][nY-1] < nH && nextB < f && f >= 4){
					nextX = nX;
					nextY = nY-1;
					nextB = f;
					nextF = t;
				}
				if(highMemo[nX-1][nY] < nH && nextB < 7-right[t][f] && 7-right[t][f] >= 4){
					nextX = nX-1;
					nextY = nY;
					nextB = 7-right[t][f];
					nextF = f;
				}
				if(highMemo[nX][nY+1] < nH && nextB < 7-f && 7-f >= 4){
					nextX = nX;
					nextY = nY+1;
					nextB = 7-f;
					nextF = 7-t;
				}
				
				if(nextB != 0){
					nX = nextX;
					nY = nextY;
					nH = highMemo[nX][nY];
					t = 7-nextB;
					f = nextF;
				}
				else{
					hantei = false;
				}
			}
			highMemo[nX][nY] = highMemo[nX][nY] + 1;
			count[numMemo[nX][nY]] = count[numMemo[nX][nY]] - 1;
			numMemo[nX][nY] = t;
			count[t] = count[t] + 1;
			
			
		}
		
		
		System.out.print(count[1]);
		for(int i = 2; i < 7; i++){
			System.out.print(" " + count[i]);
		}
		System.out.println();
	}

	
	public static void main(String[] args) {
		new Main().run();
	}
}