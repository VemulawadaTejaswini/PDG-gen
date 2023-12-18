import java.util.*;

public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n=Integer.parseInt(scan.next());
		int m=Integer.parseInt(scan.next());
		int[] x=new int [m];
		for (int i=0;i<m;++i) {
			x[i]=Integer.parseInt(scan.next());
		}
		Arrays.parallelSort(x);
		int[] diff=new int[m-1];
		for (int i=0;i<m-1;++i) {
			diff[i]=x[i+1]-x[i];
		}
		Arrays.parallelSort(diff);
		int sum=0;
		for (int i=0;i<m-n;++i) {
			sum+=diff[i];
		}
		System.out.print(sum);
				
	}
}