import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());

		int x[][] = new int[h][w];
		for(int i = 0; i < h; i++){
			for(int j = 0 ; j < w; j++){
				x[i][j]=0;
			}
		}
		for(int i = 0; i < m; i++){
			x[Integer.parseInt(sc.next())-1][Integer.parseInt(sc.next())-1] = 1;
		}
		sc.close();
		int wsum[] = new int[h];
		for(int i = 0 ; i < h ; i++){
			int n = 0;
			for(int k = 0 ; k < w ; k++){
				n += x[i][k];
			}
			wsum[i] = n;
		}
		int hsum[] = new int[w];
		for(int i = 0 ; i < w ; i++){
			int n = 0;
			for(int k = 0 ; k < h ; k++){
				n += x[k][i];
			}
			hsum[i] = n;
		}
		int max = 0;
		for(int i = 0 ; i < h ; i++){
			for(int j = 0 ; j < w; j++){
				int n = hsum[j] + wsum[i] - x[i][j];
				if(max < n){
					max = n;
				}
			}
		}
		System.out.println(max);
	}
}
