import java.util.*;

public class Main {

	static void log(int i) {
		System.out.println(i);
	}
	static void log(String s) {
		System.out.println(s);
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int ary[] = new int[n];
		long total=0;
		
		for (int i=0; i<n; i++) {
			ary[i] = sc.nextInt();
			total+=ary[i];
		}
		
		int aryPick[] = new int[m];
				
		// loop for input data
		int ctr=0;
		for (int j =0; j<n && ctr < m ; j++) {
			if ( (4 * m * ary[j]) >= total) {
				aryPick[ctr]=ary[j];
				ctr++;
			}
		}
		
		sc.close();
		log( (ctr<m) ? "No" : "Yes");
	}
}
