import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=Integer.parseInt(sc.nextLine());
		String[] S=sc.nextLine().split("");
		int[] black_data = new int[N+1];
		int[] white_data = new int[N+1];

		// 累積和の生成(黒)
		for(int i=0;i<S.length;i++) {
			if(S[i].equals("#")) {
				black_data[i+1]=black_data[i]+1;
			}
			else {
				black_data[i+1]=black_data[i];
			}
		}
		
		// 累積和の生成(白)
		for(int i=0;i<S.length;i++) {
			if(S[i].equals(".")) {
				white_data[i+1]=white_data[i]+1;
			}
			else {
				white_data[i+1]=white_data[i];
			}
		}
		
		// 白と黒の数を足して、最小数をチェック
		int min_value=99999;
		int value=0;
		for(int i=0;i<=N;i++) {
			value = black_data[i] + white_data[N] - white_data[i];
			min_value=Math.min(min_value,value);
		}
		System.out.println(min_value);
	}
}