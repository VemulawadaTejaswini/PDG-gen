import java.util.Scanner;

class Main{
	static final long MOD = 1000000007;

	static int H, W, K;
	static long[][] dp = new long[110][10];
	static int ans = 0;
	static int n = 0;


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		n = sc.nextInt();
		dfs(0);
		System.out.println(ans);



	}

	static void dfs(int x){
		if(n < x){
			return;
		}

		if (check(x)){
			ans++;
		}

			dfs(10*x + 3);
			dfs(10*x + 5);
			dfs(10*x + 7);
		

	}

	static boolean check(int x){

		String num = String.valueOf(x);
		

		if(num.contains("3") &&num.contains("5") &&num.contains("7")){
			return true;
		}else{
			return false;
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
