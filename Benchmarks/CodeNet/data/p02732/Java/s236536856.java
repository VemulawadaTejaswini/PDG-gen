import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		long[] b = new long[N];
		long sum = 0;
		
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			b[a[i]-1]++;
		}
		for (int i = 0; i < N; i++) {
			sum += b[i] * (b[i] - 1)/2;
		}
		for (int i=0; i<N; i++) {
			System.out.println(sum-(b[a[i] - 1] - 1));
		}
	}
}