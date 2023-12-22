import java.util.Scanner;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r, n, xl, xr, h, flag, temp;
		double min;
		int[][] x = new int[2][43];

		while(true){
			r = sc.nextInt();
			n = sc.nextInt();
			if(r==0 && n==0) break;

			for(int i=0; i<n; i++){
				xl = sc.nextInt();
				xr = sc.nextInt();
				h = sc.nextInt();

				for(int j=xl+21; j<=xr+21; j++){
					if(x[0][j]<=h){
						if(j>xl+21 && j<xr+21){
							x[1][j] = h;
						}else{
							if(x[0][j-1]==0 && j==xl+21 && x[1][j]==0){
							}else if(x[0][j+1]==0 && j==xr+21 && x[1][j]==0){
							}else{
								x[1][j] = x[0][j];
							}
						}
						x[0][j] = h;
					}else if(x[1][j]<h){
						if(j>xl+21 && j<xr+21){
							x[1][j] = h;
						}
					}
				}
			}

			flag = -1;
			min = 20;
			for(int i=0; i<r; i++){
				if(flag==-1 && (x[1][21+i]==0 || x[1][21-i]==0)){
					flag = i;
				}
				temp = Math.min(x[1][21+i], x[1][21-i]);
				min = Math.min(min, temp-Math.sqrt(r*r-i*i));
			}
			if(flag!=-1){
				System.out.printf("%.4f", Math.min(r-Math.sqrt(r*r-flag*flag), min+r));
			}else{
				System.out.printf("%.4f", min+r);
			}
			System.out.println();

			Arrays.fill(x[0], 0);
			Arrays.fill(x[1], 0);
		}
	}
}