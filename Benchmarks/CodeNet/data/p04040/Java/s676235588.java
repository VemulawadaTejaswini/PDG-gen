import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int H = cin.nextInt();//高
		int W = cin.nextInt();//宽
		int A = cin.nextInt();//A 对应 H
		int B = cin.nextInt();//B 对应 W 
		long sum = 0;
		for (int i=B+1 ;i<=W;i++){
			sum += C(1, 1,i,H-A) * C(i,H - A + 1,W,H);
			sum%=1000000007;
		}
		sum %= 1000000007;
		System.out.println(sum);
	} 
	
	private static long C(int x1,int y1,int x2,int y2){
		int diffx = x2 - x1;
		int diffy = y2 - y1;
		return C(diffx, diffx + diffy);
	}
	
	private static long C(int n,int m){ //M是大的，n是小的
		if (n > m - n) {
			return C(m-n, m);
		} 
		long res = 1;
		for (int i=0;i<n;i++){
			res *= m;
			m--;
		}
		
		for (int i=n;i>=1;i--){
			res /= i;
		}
		
		return res;
	}
}
