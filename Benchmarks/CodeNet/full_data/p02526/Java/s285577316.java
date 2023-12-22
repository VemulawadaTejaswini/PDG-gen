import java.util.*;

public class Main {
	public static void main( String args[] ) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] n_num = new int[n];
		int[] check = new int[n];
		for(int i=0; i<n; i++) {
			n_num[i] = in.nextInt();
			check[i] = n_num[i];
			for(int j=0; j<i; j++) {
				if (check[j] == n_num[i]) {
					i--; n--;
				}
			}
		}
		int q = in.nextInt();
		int[] q_num = new int[q];
		for(int i=0; i<q; i++) {
			q_num[i] = in.nextInt();
		}
		Arrays.sort(n_num);
		Arrays.sort(q_num);
		
		int count = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<q; j++) {
				if(n_num[i] > q_num[j]) break;
				if(n_num[i] == q_num[j]) count++;
			}
		}
		System.out.println(count);
	}
}