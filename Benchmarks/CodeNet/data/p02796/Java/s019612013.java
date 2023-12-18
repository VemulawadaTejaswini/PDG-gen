import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[][] xy = new long[n][2];
		for(int i=0;i<n;i++){
			xy[i][0] = sc.nextLong();
			xy[i][1] = sc.nextLong();
		}
		sc.close();
		Arrays.sort(xy, (x, y) -> Long.compare(x[0], y[0]));
		int r = 0;
		boolean[] rm = new boolean[n];
		for(int i=0;i<n;i++){
			// 右に腕を伸ばしたときにx(i+1)と重なるか
			if(i+1<n && xy[i][0]+xy[i][1]>=xy[i+1][0]){
				r++;
				rm[i] = true;
			}
		}
		for(int i=n-1;i>0;i--){
			if(!rm[i]){
				int c = 0;
				for(int j=i-1;j>=0;j--){
					if(!rm[j]){
						c = j;
						break;
					}
				}
				// 左に腕を伸ばしたときにx(j)と重なるか
				if(c>0 &&  xy[i][0]-xy[i][1]<=xy[c][0]){
					r++;
				}
			}
		}
		System.out.println(n-r);
	}
}