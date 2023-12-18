import java.util.Scanner;

class Main{
	static final long MOD = 1000000007;

	static int H, W, K;
	static long[][] dp = new long[110][10];
	static int ans = 0;
	static long n = 0;


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		n = sc.nextLong();

		if(n == 25){
			System.out.println("Christmas");
		}else if(n == 24){
			System.out.println("Christmas Eve");

		}else if(n == 23){
			System.out.println("Christmas Eve Eve");

		}else{
			System.out.println("Christmas Eve Eve Eve");

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
