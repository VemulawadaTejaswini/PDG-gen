import java.util.Scanner;

class Main{
	static final long MOD = 1000000007;

	static int H, W, K;
	static long[][] dp = new long[110][10];
	static int ans = 0;
	static long n = 0;





	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		long n = sc.nextLong();
		long m = sc.nextLong();
		for(int i = 100000000;i >= 1;i--){
			if(m%i == 0 && i*n<=m){
				System.out.println(i);
				return;

			}
		}

	}
}







	class Pair implements Comparable{
		int from;		//p
		int end;		//y
		int num;
		int bango;
		@Override
		public int compareTo(Object other) {
			Pair otherpair = (Pair)other;

			return end - otherpair.end;
		}
	}

