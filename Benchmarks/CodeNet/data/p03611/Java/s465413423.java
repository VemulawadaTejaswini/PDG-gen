import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 入出力高速化 java.io.* とthrows IOExceptionを忘れずに
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String[] IN =br.readLine().split(" ") ;
		
		int[]A = new int[3*N];
		for(int i=0; i<N; i++) {
			int a = Integer.parseInt(IN[i]);
			A[i] = a;
			A[i+N] = a-1;
			A[i+2*N] = a+1;
		}
		Arrays.sort(A);

		int X = A[0]; //出現回数カウントの基準値
		int count = 1; //現在の出現回数
		int max = 1; //出現回数の最大値
		int mode = A[0]; //最頻値初期値

		for(int a=1; a<A.length; a++){
			if (X == A[a]){
				// 調査対象が基準となるXと同じ値であるとき
				// 現在の出現回数に1を足す
				count++;
			}else{
				if(count>max){
					// 調査対象が基準となるXと異なる値であるとき、現在の最頻値と出現回数を更新
					mode = X;
					max = count;
				}

				// 調査基準を変更し、出現回数を初期化
				X = A[a];
				count = 1;
			}
		}

		if (count>max){ //3N端の処理
			max = count;
		}
		
		System.out.println(max);	
	}
}