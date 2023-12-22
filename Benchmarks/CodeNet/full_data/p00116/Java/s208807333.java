import java.util.Scanner;

//Rectangular Searching
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int H = sc.nextInt();
			int W = sc.nextInt();
			if((H|W)==0)break;
			int[][] a = new int[H][W];
			int[][] sum = new int[H+1][W+1];
			for(int i=0;i<H;i++){
				char[] s = sc.next().toCharArray();
				for(int j=0;j<W;j++)a[i][j]=s[j]=='.'?1:0;
			}
			for(int i=1;i<=H;i++){
				for(int j=1;j<=W;j++){
					sum[i][j] = a[i-1][j-1] + sum[i-1][j] + sum[i][j-1] - sum[i-1][j-1];
				}
			}
			int max = 0;
			for(int w=1;w<=W;w++){
				for(int h=1;h<=H;h++){
					if(w*h<=max || sum[H][W]<w*h)break;
					for(int i=h;i<=H;i++){
						if(w*h<=max || sum[i][W]-sum[i-h][W]<w*h)break;
						for(int j=w;j<=W;j++){
							if(sum[i][j]-sum[i-h][j]-sum[i][j-w]+sum[i-h][j-w]==w*h){
								max = Math.max(max, w*h);
								break;
							}
						}
					}
				}
			}
			System.out.println(max);
		}
	}
}