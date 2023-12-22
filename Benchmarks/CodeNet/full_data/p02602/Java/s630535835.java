import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	private static Scanner sc;
	
	public static void main(String[] args) {
		sc =  new Scanner(System.in);
		//N:学期の総数を表す
		int n = Integer.parseInt(sc.next());
		//K:学期目を表す
		int k = Integer.parseInt(sc.next());
		//各学期のテスト結果
		BigDecimal[] aArray = new BigDecimal[n];
		for (int i=0; i<n; i++) {
			aArray[i] = BigDecimal.valueOf(Integer.parseInt(sc.next()));
		}
		
		BigDecimal[] aResult = new BigDecimal[n];
		for(int i=k; i<=n; i++) {
			
			//k+1個の計算結果を格納する？
			//K+i-1の計算
			BigDecimal beforeSum = new BigDecimal(1);
			for (int j=1; j<=k; j++) {
				beforeSum = beforeSum.multiply(aArray[i-j]);
			}
			aResult[i-k] = beforeSum;
		}
		
		for (int i=0; i<n-k; i++) {
			if(aResult[i+1].compareTo(aResult[i]) > 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");				
			}
		}
		

		
	}
}
