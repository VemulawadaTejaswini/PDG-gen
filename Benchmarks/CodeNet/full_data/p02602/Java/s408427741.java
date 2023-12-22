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
		long[] longArr = new long[n];
		for (int i=0; i<n; i++) {
			longArr[i] = Long.parseLong(sc.next());
		}
		
		for(int i=k; i<n; i++) {
			if(longArr[i-k] < longArr[i]) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		
	}
}
