import java.util.Scanner;

class Main{
	static final long MOD = 1000000007;

	static int H, W, K;
	static long[][] dp = new long[110][10];
	static int ans = 0;
	static long n = 0;





	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		String S = sc.next();
		String T = sc.next();
		for(int i = 0;i < S.length();i++){
			if(S.charAt(i) != T.charAt(i)){
				for(int j = i+1;j < S.length();j++){
					if(T.charAt(i) == T.charAt(j) ){
						if(S.charAt(i) != S.charAt(j) || T.charAt(i) == S.charAt(i)){
							System.out.println("No");
							return;
							
						}
					}
				}
			}
		}

		System.out.println("Yes");


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

