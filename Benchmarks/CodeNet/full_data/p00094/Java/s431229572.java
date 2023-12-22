import java.math.*;
import java.util.*;
import static java.lang.System.*;

public class Main {
	//初期フィールド・メソッド---------------------------------------------
	static Scanner sc = new Scanner(System.in);
	static int min(int... ar) {Arrays.sort(ar); return ar[0];}
	static int max(int... ar) {Arrays.sort(ar); return ar[ar.length-1];}
	//------------------------------------------------------------


	//フィールド追加場所-----------------------------------------------
	//------------------------------------------------------------


	//メソッド追加場所------------------------------------------------
	//------------------------------------------------------------


	//mainメソッド---------------------------------------------------
	public static void main(String[] args) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		BigDecimal bd1 = new BigDecimal(a*b);
		BigDecimal bd2 = new BigDecimal(3.305785);
		BigDecimal ans = bd1.divide(bd2,5,RoundingMode.HALF_UP);
		out.println(ans);
	}
	//------------------------------------------------------------
}
