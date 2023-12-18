import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 入出力高速化 java.io.* とthrows IOExceptionを忘れずに
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[]A = new int[N];
		for(int a=0;a<N;a++) {
			A[a] = Integer.parseInt(br.readLine());
		}
		
		int count = 0;
		int now = 1;
		for(;count<N && now!=2;count++,now = A[now-1]) {
		}
		if(count == N)count = -1;
		
		System.out.println(count);	
	}
}