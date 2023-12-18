import java.util.*;
import java.io.*;

public class Main {
		public static void main(String[] args) throws IOException {
		
		// 入出力高速化 java.io.* とthrows IOExceptionを忘れずに
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Long N = Long.parseLong(br.readLine());
		
		N+=1;
		String S = N.toString();
		long ans = 9*(S.length()-1) + (S.charAt(0)-'0' -1);
		
        System.out.println(ans);
    }
}