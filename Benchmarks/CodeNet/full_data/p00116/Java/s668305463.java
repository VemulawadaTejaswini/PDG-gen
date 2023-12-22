import java.util.Scanner;

//Rectangular Searching
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int h = sc.nextInt();
			int w = sc.nextInt();
			if((h|w)==0)break;
			char[][] m = new char[h][w];
			for(int i=0;i<h;i++)m[i]=sc.next().toCharArray();
			int[][] c = new int[h][w];
			for(int i=0;i<h;i++){
				int x = 1;
				for(int j=w-1;j>=0;j--){
					if(m[i][j]=='.'){
						c[i][j] = x++;
					}
					else{
						c[i][j] = 0;
						x = 1;
					}
				}
			}
			int max = 0;
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					if(0<i&&c[i][j]==c[i-1][j]||c[i][j]==0)continue;
					int k = 1;
					while(i+k<h&&c[i][j]<=c[i+k][j])k++;
					max = Math.max(max, k*c[i][j]);
				}
			}
			System.out.println(max);
		}
	}
}