import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	// Atcoder用のサンプルプログラム
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			//line = br.readLine();
			
			int sum = 0;
			int max = 0;
			String temp = br.readLine();
			String N = temp.split(" ")[0];
			int n = Integer.parseInt(N);
			int M = Integer.parseInt(temp.split(" ")[1]);
			
			String[] Xtemp = br.readLine().split(" ");
			Integer[] X = new Integer[M]; 
			for (int i = 0;i < M;i++) {
				X[i] = Integer.parseInt(Xtemp[i]);
			}
			
			Arrays.sort(X);
			int x1=-99999;
			Integer[] sa = new Integer[M];
			for (int i = 0;i < M;i++) {
				int x2 = X[i];
				sa[i] = Math.abs(x2-x1);
				x1=x2;
			}
			Arrays.sort(sa);
			int sumFinal=0;
			for (int i = 0;i < M-n;i++) {
				sumFinal=sumFinal+sa[i];
					
			}
			System.out.println(sumFinal);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
