import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),m = sc.nextInt();
		if(m == 1) {
			System.out.println(0);
			return;
		}
		int[] x = new int[m];
		int[] xdif = new int[m-1]; //差
		int[] xidx = new int[2000001]; //どの差がどのインデックスか
		for(int i = 0;i < m;i ++) {
			x[i] = sc.nextInt();
		}
		Arrays.sort(x);
		//System.out.println(Arrays.toString(x));
		for(int i = 0;i < m - 1;i ++) {
			xdif[i] = x[i+1] - x[i];
			xidx[xdif[i]] = i;
		}
		//System.out.println(Arrays.toString(xdif));
		Arrays.sort(xdif);
		//System.out.println(Arrays.toString(xdif));
		int len = xdif.length;
		int[] groupidx = new int[n-1];
		for(int i = 0;i < n - 1;i ++) {
			groupidx[i] = xidx[xdif[len - 1 - i]];
		}
		//System.out.println(Arrays.toString(groupidx));
		int sum = 0;
		for(int i = 0;i < n - 1;i ++) {
			int  g = groupidx[i];
			//System.out.println("g:"+x[g]);
			//System.out.println("sum:"+sum);
			if(n == 2) {
				if(groupidx[i] == 0) {
					sum += x[x.length - 1] - x[g+1];
				}else {
					sum += x[g] - x[0];
					sum += x[x.length - 1] - x[g+1];
				}
			}else {
				if(i == 0){
					if(groupidx[i] != 0) {
						sum += x[g] - x[0];
					}
				}else if(i == n - 2) {
					sum += x[g] - x[groupidx[i-1]+1];
					sum += x[x.length - 1] - x[g+1];
				}else {
					if(groupidx[i - 1] != groupidx[i]) { //グループの要素数が１じゃないとき
						sum += x[g] - x[groupidx[i-1]+1];
					}
				}
			}
		}
		System.out.println(sum);
	}
}