import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt();
		int[] W = new int[N];
		int sum = 0;
		for(int i = 0; i < N; i++) {
			W[i] = sc.nextInt();
			sum += W[i];
		}
		int min = Integer.MAX_VALUE;
		for(int i = 1; i < N; i++) {
			int S1 = 0;
			for(int j = 0; j < i; j++) {
				S1 += W[j];
			}
			min = Math.min(min, Math.abs(S1 - (sum - S1)));
		}
		System.out.println(min);
	}
}