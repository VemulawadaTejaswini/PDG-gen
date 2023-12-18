import java.util.Scanner;
public class Main {
	static int[]l;
	static int min = 1000000000;
	static int N, A, B, C;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		l = new int[N];
		for(int i = 0; i < N; i++) {
			l[i] = sc.nextInt();
		}
		dfs(0, 0, 0, 0, 0);
		System.out.println(min);
	}
	static void dfs(int n, int a, int b, int c, int comb) { //深さ優先探索
		if(n == N) { //探索木の底に行き着いた時
			if(a == 0 || b == 0 || c == 0) {
				return;//a目標,b目標,c目標に一本も用いない場合のコスト計算を省く
			}
			int cost = Math.abs(A - a) + Math.abs(B - b) + Math.abs(C - c); //+-どっちでも1mpなので長さの差がコスト
			cost += comb - 30;  //無と結合しているとみなして設けた最小結合コスト30を引く
			min = Math.min(min, cost);
			return;
		}
		dfs(n + 1, a, b, c, comb); //d:捨てる
		dfs(n + 1, a + l[n], b, c, comb + 10);//a 
		dfs(n + 1, a, b + l[n], c, comb + 10);//b
		dfs(n + 1, a, b, c + l[n], comb + 10);//c
		//一つ一つが再帰的に最下層まで行く
	}
}