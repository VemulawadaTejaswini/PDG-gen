import java.util.*;
import java.io.*;

public class Main {
		public static void main(String[] args) throws IOException {
		
		// 入出力高速化 java.io.* とthrows IOExceptionを忘れずに
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String S = br.readLine();
		String T = br.readLine();
		
		int Tstart = 0;
		for(int t=T.length(); t>0;t--){
			for(int s=0; s<S.length(); s++){
				if(S.substring(s).contentEquals(T.substring(0,t))){
					Tstart = t;
				}
			}
		}
		
        System.out.print(S.length()+T.length()-Tstart);
    }
}