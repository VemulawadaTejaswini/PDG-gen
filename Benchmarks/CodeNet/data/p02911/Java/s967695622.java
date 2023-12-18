import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N= scan.nextInt();
		int K= scan.nextInt();		
		int Q= scan.nextInt();
		int[] ans = new int [Q]; 
		int[] point = new int[N];
		for (int i=0;i<Q;i++) {
			ans[i] = scan.nextInt();
			point[ans[i]-1]++;
		}
		for(int i=0;i<N;i++) {
			if(K-Q+point[i]>0) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
		
	}
}