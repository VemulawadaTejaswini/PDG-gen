import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int N = 0;
		String S;
		int K = 0;

		Scanner sc = new Scanner(System.in);
		N = Integer.parseInt(sc.next());
		S = sc.next();
		K = Integer.parseInt(sc.next());
		char s = S.charAt(K-1);
		int n;
		for(n=0;n<N;n++){
			if((String.valueOf(s).equals(String.valueOf(S.charAt(n))))==false){
				S= S.replaceFirst(String.valueOf(S.charAt(n)),"*");
			}
		}
		System.out.println(S);
	}
}