import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();
		int m=sc.nextInt();
		int p[]= new int[m+1];
		long y[]=new long[m+1];
		Map<Long,Integer> map= new HashMap<Long,Integer>();
		long num[]=new long[m];
		Arrays.fill(num, 1000000);

		long py[][]=new long[n+1][m+1];
		long count[]= new long[n+1];
		Arrays.fill(count,  0);

		for (int i=1;i<=m;++i){
			p[i]=sc.nextInt();
			y[i]=sc.nextInt();
			++count[p[i]];
			py[p[i]][(int)count[p[i]]]=y[i];
		}

		for(int i=1;i<=n;++i){
			long newpy[][]=new long[n+1][(int)count[p[i]]];
			for(int j=1;j<=count[p[i]];++j){
				newpy[i][j-1]=py[i][j];
			}
			Arrays.sort(newpy[i]);
			for(int j=0;j<count[p[i]];++j){
				map.put(newpy[i][j], j+1);
			}
		}
		for( int i=1;i<=m;++i){
			String s=String.valueOf((long)1000000+p[i]);
			String s2=String.valueOf(1000000+map.get(y[i]));
			System.out.println(s.substring(1)+s2.substring(1));
		}
	}
}