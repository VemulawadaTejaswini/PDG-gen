
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i =0;  i<N; i++){
			A[i] = sc.nextInt();
		}
		int[] count = new int[N];

		for(int a : A) {
			count[a-1] ++;
		}

		long sum = 0;
		for(int c : count) {
			sum += combination(c, 2);
		}
		
		for(int k=0; k < N; k++) {
			System.out.println(sum - (count[A[k]-1] -1 ));
		}

	}
	//組み合わせの数nCrを計算
	static long combination(long n, long r){
		if(n < r) return 0;
		long num = 1;
		for(long i = 1; i <= r; i++){
			num = num * (n - i + 1) / i;
		}
		return num;
	}
}





