import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int N = sc.nextInt();
		int K = sc.nextInt();
		int Q = sc.nextInt();
		int A[] = new int[Q];
		for(int i=0; i<Q; i++) {
			A[i] =sc.nextInt();
		}
		//N個分のポイントの配列を作成
		int point[] = new int[N];
      	//すべての要素をK-Qにする
		Arrays.fill(point, K-Q);
		//A[i]-1番目の要素に+1ずづ加算する
		for(int i=0; i<Q; i++) {
			point[A[i]-1]++;
		}
		//point[i]が0の場合はYes、そうでなければNo
		for(int i=0; i<N; i++) {
			if(point[i]<=0) {
				System.out.println("No");
			}else {
				System.out.println("Yes");
			}
		}
	}
}