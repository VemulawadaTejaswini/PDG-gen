public class Main {
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		int n = in.nextInt();
		int[] n_num = new int[n];
		for(int i=0; i<n; i++) {
			n_num[i] = in.nextInt();
		}
		java.util.Arrays.sort(n_num);
		
		int q = in.nextInt();
		int[] q_num = new int[n];
		for(int i=0; i<n; i++) {
			q_num[i] = in.nextInt();
		}
		int count = 0, point = 0;
		for(int i=0; i<q; i++) {
			for(int j=point; j<n; j++) {
				if(q_num[j] == n_num[i]) count++;
				if(q_num[j] > n_num[i]) break;
				point++;
			}
		}
	}
}