import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long[][] senryaku = new long[8][N];
		for(int i=0;i<N;++i){
			long x = sc.nextLong();
			long y = sc.nextLong();
			long z = sc.nextLong();
			senryaku[0][i] = x+y+z;
			senryaku[1][i] = x+y-z;
			senryaku[2][i] = x-y+z;
			senryaku[3][i] = x-y-z;
			senryaku[4][i] = -1*x+y+z;
			senryaku[5][i] = -1*x+y-z;
			senryaku[6][i] = -1*x-y+z;
			senryaku[7][i] = -1*x-y-z;
		}
		for(int i=0;i<8;++i) Arrays.sort(senryaku[i]);
		
		long[] ans = new long[8];
		for(int i=0;i<8;++i) ans[i] = 0;
		for(int i=N-1;i>=N-M;--i){
			for(int j=0;j<8;++j) ans[j] += senryaku[j][i];
		}
		Arrays.sort(ans);
		System.out.println(ans[7]);
		return;
	}
}