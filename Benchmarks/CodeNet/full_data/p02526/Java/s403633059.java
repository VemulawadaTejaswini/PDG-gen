public class neo {
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		int n = in.nextInt();
		int[] n_num = new int[n];
		for(int i=0; i<n; i++) {
			n_num[i] = in.nextInt();
		}
		java.util.Arrays.sort(n_num);
		
		int q = in.nextInt();
		int[] q_num = new int[q];
		for(int i=0; i<q; i++) {
			q_num[i] = in.nextInt();
		}
		int count = 0;
		for(int i=0; i<q; i++) {
			for(int j=0; j<n; j++) {
				if(q_num[i] == n_num[j] && n_num[j-1] != n_num[j]) {
					count++;
					break;
				}
				if(q_num[i] < n_num[j]) break;
			}
		}
		System.out.println(count);
	}
}