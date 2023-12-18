import java.util.*;

public class Main {
	
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n=Integer.parseInt(scan.next());
		int[] d=new int[n];
		for (int i=0;i<n;++i) {
			d[i]=Integer.parseInt(scan.next());
		}
		Arrays.parallelSort(d);
		if (d[n/2]==d[n/2-1]) {
			System.out.print(0);
		}else {
			System.out.print(d[n/2]-d[n/2-1]);
		}
		
}
}
//end