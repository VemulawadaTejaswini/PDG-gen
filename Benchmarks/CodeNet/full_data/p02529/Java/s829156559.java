public class Main {
	public static void main( String args[] ) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		int n = in.nextInt();
		int[] n_num = new int[n];
		for(int i=0; i<n; i++) {
			n_num[i] = in.nextInt();
		}
		int q = in.nextInt();
		int[] q_num = new int[q];
		for(int i=0; i<q; i++) {
			q_num[i] = in.nextInt();
		}
		
		int count = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<q; j++) {
				if(n_num[i] == q_num[j]) count++;
			}
		}
		System.out.println(count);
	}
}