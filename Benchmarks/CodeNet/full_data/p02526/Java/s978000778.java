public class Main {
	public static void main( String args[] ) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		int n = in.nextInt();
		java.util.Set<Integer> n_num = new java.util.HashSet<Integer>();
		for(int i=0; i<n; i++) {
			n_num.add(in.nextInt());
		}
		int q = in.nextInt();
		int count = 0;
		for(int i=0; i<q; i++) {
			int q_num = in.nextInt();
			if(n_num.contains(q_num)) count++;
		}
		System.out.println(count);
	}
}