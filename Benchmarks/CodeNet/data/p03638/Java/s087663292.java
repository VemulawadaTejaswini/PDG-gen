import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int[][] data = new int[H][W];
		int N = sc.nextInt();
		int r = 0;
		int c = 0;
		boolean add = true;
		for(int i = 1 ; i<=N; i++){
			int cnt = sc.nextInt();
			for(int j = 0 ; j<cnt; j++){
				if(c == W){
					c = W-1;
					r++;
					add = false;
				}
				else if(c == -1){
					c = 0;
					r++;
					add = true;
				}
				data[r][c] = i;
				if(add){
					c++;
				}
				else{
					c--;
				}
			}
		}
		for(int i = 0 ; i <H; i++){
			for(int j = 0 ; j<W; j++){
				System.out.print(data[i][j]);
				if(j!=W-1)System.out.print(" ");
			}
			System.out.println();
		}
	}
}
