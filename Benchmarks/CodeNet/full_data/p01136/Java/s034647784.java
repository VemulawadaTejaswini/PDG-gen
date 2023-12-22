import java.util.Scanner;
import java.io.PrintWriter;

public class Main {
	static Scanner scan = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);
	public static void main(String[] args){
		while(true){
			int n = si();
			if(n==0) break;
			boolean[][] list = new boolean[n][30];
			long[] map = new long[n];
			int res = -1;
			for (int i = 0; i < n; i++) {
				int m = si();
				map[i]=1L<<i;
				for (int j = 0 ;j < m ; j++)
					list[i][si()-1]=true;
			}
			for (int i = 0; i < 30; i++) {
				long tmp = 0;
				for (int j = 0; j < n; j++)
					if(list[j][i]) tmp |= map[j];
				for (int j = 0; j < n; j++)
					map[j]=tmp;
				if(tmp==(1L<<n)-1){
					res = i+1;
					break;
				}
			}
			out.println(res);
		}
		out.flush();
	}
	static int si(){
		return Integer.parseInt(scan.next());
	}
}