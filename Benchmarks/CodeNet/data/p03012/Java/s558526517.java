import java.util.Scanner;
class Main {
	public  static void main(String[] args) {
 
		Scanner sc = new  Scanner(System.in);
		int N = sc.nextInt();
		int[] W = new int[N];
		int r_sum = 0;
		int l_sum = 0;
		int lmin = 100;
 
		for(int i =0;i<N;i++) {
			W[i] = sc.nextInt();
		}
 
		for(int i=1; i < N;i++) {
			r_sum = W[0];
			l_sum = 0;
			for (int j = 1;j < i; j++) {
				r_sum += W[j];
			}
			for (int z = i;z < N; z++) {
				l_sum += W[z];
			}
			lmin = Math.min(lmin, Math.abs(r_sum - l_sum));
		}
		System.out.println(lmin);
 
	}
}