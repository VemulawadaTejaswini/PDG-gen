import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int table[][] = new int[n+m][2];
		for(int i=0;i<n;i++) {
			table[i][0]=sc.nextInt();
			table[i][1]=1;
		}
		for(int i=0;i<m;i++) {
			table[n+i][1]=sc.nextInt();
			table[n+i][0]=sc.nextInt();
		}
		
		Arrays.sort(table, (a, b) -> Integer.compare(a[0], b[0]));
		
		long backet=n;
		int number=n+m-1;
		long sum=0;
		long t0, t1;
		while(backet>0) {
			t0=table[number][0];
			t1=table[number][1];
			sum+=t0 * min(t1, backet);
			backet-=t1;
			number--;
		}
		
		System.out.println(sum);
		
	}
	
	public static long min(long a, long b) {
		if(a<b)
			return a;
		else
			return b;
	}

}