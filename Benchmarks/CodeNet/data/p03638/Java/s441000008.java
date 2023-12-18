import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int w = sc.nextInt();
		
		int n = sc.nextInt();
		
		int[] a = new int[n];
		
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}

		int[][] mat = new int[h][w];
		
		int cnt = 0;
		int num = 1;
		int index = 0;
		
		for(int i=0; i<h; i++){
			for(int j=0; j<w; j++){
				int x=j;
				if(i%2 != 0){
					x = w-j-1;
				}
				
				if(cnt >= a[index]){
					num++;
					index++;
					cnt = 0;
				}
				mat[i][x] = num;
				cnt++;
			}
		}
		for(int i=0; i<h; i++){
			for(int j=0; j<w; j++){
				System.out.print(mat[i][j]);
			}
			System.out.println("");
		}

	}
}