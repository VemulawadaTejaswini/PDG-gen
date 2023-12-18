import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

		public static void main(String[] args){
			 int sum ;
			
			Scanner sc = new Scanner(System.in);
			// 整数の入力
			// スペース区切りの整数の入力
			int N = sc.nextInt();
			int K = sc.nextInt();

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    String str;
			try {
				str = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
				return;
			}
		    StringTokenizer st = new StringTokenizer(str, " ");
		    int count = st.countTokens();
		    int goukei = 0;
			for (int i = 0; i < count;i ++ ){
			    int X = Integer.parseInt(st.nextToken());
			    int ans1 = Math.abs(X - 0);
			    int ans2 = Math.abs(X - K);
			    if (ans1 > ans2){
			    	goukei = goukei + ans2 * 2;
			    }else{
			    	goukei = goukei + ans1 * 2;
			    }
			    	
		    }

			// 出力
			System.out.println(goukei);
		}
}
