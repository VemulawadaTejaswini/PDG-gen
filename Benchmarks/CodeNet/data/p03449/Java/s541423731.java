import java.util.*;

public class Main {
	public static void main(String[] args)  {
		Scanner scan =new Scanner(System.in);
		int n=Integer.parseInt(scan.nextLine());
		int[][] a = new int [2][n];
		for (int i = 0;i < n ;++i)a[0][i]=Integer.parseInt(scan.next());
		scan.nextLine();
		for (int i = 0;i < n ;++i)a[1][i]=Integer.parseInt(scan.next());

		long[] cs_upper = new long [n];cs_upper[0]=a[0][0];
		long[] cs_lower = new long [n];cs_lower[n-1]=a[1][n-1];
		for (int i = 1;i < n; ++i){
			cs_upper[i] = cs_upper[i-1]+a[0][i];
			cs_lower[n-i-1] = cs_lower[n-i]+a[1][n-i-1];
		}
		long max=0;
		for (int i = 0;i < n;++i){
			max=Math.max(max, cs_lower[i]+cs_upper[i]);
		}
		System.out.print(max);
	}
}
//end
