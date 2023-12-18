import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] X = new int[N];
		int min =0;
		int answer = Integer.MAX_VALUE;
      
		for(int i=0; i<N; i++) {
			X[i] = sc.nextInt();
		}
      	//来るたびにminを初期化する
      	//制約以内で繰り返す
		for(int j=1;  j<=100; j++) {
			min = 0;
          //体力消費(Xi-P)の2乗を計算しminに加算
			for(int i=0; i<N; i++) {
			min += (X[i]-j)*(X[i]-j);
			}
          //answerにminとMAX_VALUEを比べ最小値を入れる
			answer = Math.min(min,answer);
		}
		System.out.println(answer);
	}		
}