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
		int[] x = new int[n];
		int[]y = new int[n];
		int[] h = new int[n];
		for(int i = 0;i < n;i++){
			x[i] =sc.nextInt();
			y[i] = sc.nextInt();
			h[i] = sc.nextInt();
		}
		for(int cx = 0;cx <= 100;cx++){
			for(int cy = 0;cy <= 100;cy++){
				long H = 0;
				for(int i = 0;i < n;i++){
					if(h[i] != 0){
						H= (long)( h[i] +(long) Math.abs(x[i]-cx) +  Math.abs(y[i]-cy));

					}
				}
				
				
				boolean flag = true;

				for(int i = 0;i < n;i++){
					long kari = 0;
					if(h[i] != 0){
						kari= (long)( h[i] +(long) Math.abs(x[i]-cx) +  Math.abs(y[i]-cy));


						if(H != kari){
							flag = false;
							break;
						}
					}
				}
				if(flag){
					System.out.println(cx + " " + cy + " " + H);
				}
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

