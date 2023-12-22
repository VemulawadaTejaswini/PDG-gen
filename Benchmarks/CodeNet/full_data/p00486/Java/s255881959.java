import java.util.Arrays;
import java.util.Scanner;

//Walking Santa
public class Main{

	void run(){
		Scanner sc = new Scanner(System.in);
		sc.nextInt(); sc.nextInt();
		int n = sc.nextInt();
		int[] x = new int[n], y = new int[n];
		int[][] p = new int[n][2];
		for(int i=0;i<n;i++){
			x[i] = p[i][0] = sc.nextInt(); y[i] = p[i][1] = sc.nextInt();
		}
		Arrays.sort(x);
		Arrays.sort(y);
		long res = 1L<<60, rx = -1, ry = -1;
		for(int px = x[(n-1)/2]-100;px<x[(n-1)/2]+100;px++)for(int py=y[(n-1)/2]-100;py<y[(n-1)/2]+100;py++){
			long max = 0, sum = 0;
			for(int i=0;i<n;i++){
				long len = Math.abs(px-p[i][0])+Math.abs(py-p[i][1]);
				sum+=2*len;
				max = Math.max(max, len);
			}
			if(sum-max < res){
				res = sum-max;
				rx = px; ry = py;
			}
		}
		System.out.println(res);
		System.out.println(rx+" "+ry);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}