import java.util.HashMap;
import java.util.Map;
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
		Map<Character, Integer> sdata = new HashMap<Character,Integer>();
		Map<Character, Integer> tdata = new HashMap<Character,Integer>();

		for(char i = 'a' ;i <= 'z';i++){
			sdata.put(i, 0);
		}
		for(int i = 0;i < S.length();i++){
			int count = sdata.get(S.charAt(i));
			sdata.put(S.charAt(i), count+1);
		}
		for(char i = 'a' ;i <= 'z';i++){
			tdata.put(i, 0);
		}
		for(int i = 0;i < T.length();i++){
			int count = tdata.get(T.charAt(i));
			tdata.put(T.charAt(i), count+1);
		}
		for(int i = 0;i < S.length();i++){
			if(sdata.get(S.charAt(i)) != tdata.get(T.charAt(i))){
				System.out.println("No");
				return;
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

