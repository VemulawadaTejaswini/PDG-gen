import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		// 1行目数字、2行目文字
		// 1行目数字、2行目文字
		BigDecimal x = new BigDecimal(br.readLine());

		BigDecimal b11 = new BigDecimal("11");
		BigDecimal b0 = new BigDecimal("0");
		BigDecimal b1 = new BigDecimal("1");
		BigDecimal b2 = new BigDecimal("2");
		BigDecimal b6 = new BigDecimal("6");
		
		
		if (x.compareTo(b6) <= 0) { 
			System.out.println(1);
			return;
		}
		
		if (x.compareTo(b11) <= 0) { 
			System.out.println(2);
			return;
		}
		
		
		//i = 7 % 3;    // i = 1
		BigDecimal a = x.divide(b11, 0, BigDecimal.ROUND_DOWN);
		a = a.multiply(b2);

		BigDecimal mod = x.remainder(b11);


		if (mod.compareTo(b0) == 0) {
		} else {
			if (mod.compareTo(b6) > 0) {
				a = a.add(b2);
			} else {
				a = a.add(b1);
			}
		}
		
		

        //System.out.println("mod=[" + mod + "]");
        System.out.println(a);
        return;
    }
    // Debug.Print
    static void dp(String s) {
		System.out.println(s);
	}
    static void dp(StringBuilder s) { dp(s.toString()); }
    static void dp(int i) { dp(String.valueOf(i)); }
    static void dp(long i) { dp(String.valueOf(i)); }

}