import java.util.*;

public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n=Integer.parseInt(scan.next());
		int k=Integer.parseInt(scan.next());
		int[] h=new int [n];
		for (int i=0;i<n;++i) {
			h[i]=Integer.parseInt(scan.next());
		}
		Arrays.parallelSort(h);
		int[] diff =new int[n-1];
		for(int i=0;i<n-1;++i) {
			diff[i]=h[i+1]-h[i];
		}
		Arrays.parallelSort(diff);
		
		System.out.print(diff[0]+diff[--k]);
		

	}
}
//end
