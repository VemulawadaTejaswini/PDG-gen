import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public int findWay(int[][] mat,int N,int C,int R,int count,int rI,int cI) {
  		if(rI > N-R ) {
			if(cI < N-C) {
				cI++;
				return findWay(mat, N, C, R, count,0, cI);
			}
			else {
				return count;
			}
		}
		if(rI <= N-C) {
			rI++;
		}else {
			rI = 0;
		}
		count++;
		return findWay(mat, N, C, R, count, rI, cI);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {	
		Main ac = new Main();
		int count = 0;
		int N,R=4,C;
		int cI,rI;
		cI = 0;
		rI = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		R = Integer.parseInt(br.readLine());
      	C = Integer.parseInt(br.readLine());
		int mat[][] = new int[N][N];
		System.out.println(ac.findWay(mat, N, C, R, count, rI, cI));
	}
}
