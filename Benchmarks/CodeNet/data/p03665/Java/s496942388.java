import java.util.Scanner;

class NumTh{
	static long Choose(long n, long k) {
		long res = 1;
		for(long i = n; i >= n - k + 1; i--) {
			res *= i;
			res /= k - n + i;
		}
		return res;
	}
}

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), P = sc.nextInt();
		long Even = 0, Odd = 0;
		for(int i = 0; i < N; i++) {
			int A = sc.nextInt();
			if(A % 2 ==0) Even++;
			else Odd++;
		}
		if(Odd == 0) {
			if(P == 0) System.out.println((long)1 << Even);
			else System.out.println(0);
		}else System.out.println((long)1 << (long)(N - 1));
	}
}