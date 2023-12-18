import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		// スペース区切りの整数の入力
		String S = sc.next();
		
		int K = sc.nextInt();
		
		String[] a = S.split("");
		char[] b = new char[S.length()];
		char r = a[K - 1].charAt(0);
		
		for(int n = 0; n < N; n++) {
			b[n] = a[n].charAt(0);
		}
		
		for(int i = 0; i < N; i++) {
			if(b[i] == r) {
				System.out.print(b[i]);
			}
			else if(b[i] != r) {
				b[i] = '*';
				System.out.print(b[i]);
			}
		}

		// 出力
		System.out.println();
	}
}