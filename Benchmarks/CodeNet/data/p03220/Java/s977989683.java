import java.util.Scanner;

class Main{
	static final long MOD = 1000000007;

	static int H, W, K;
	static long[][] dp = new long[110][10];
	static int ans = 0;
	static long n = 0;





	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int t = sc.nextInt()*1000;
		int a = sc.nextInt()*1000;
		int[] h = new int[n];
		for(int i= 0;i < n;i++){
			h[i] =sc.nextInt();
		}
		long ans = 1000000000;
		int num = 0;
		for(int i=0;i < n;i++){
			int k = t - h[i] * 6;
			long m = ans;
			ans = Math.min(ans, Math.abs(a-k));
			if(m!=ans){
				num = i;
			}
		}
		
		System.out.println(num+1);



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

