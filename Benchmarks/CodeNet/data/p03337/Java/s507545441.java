import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.StringTokenizer;

public class Main {

	// Atcoder用のサンプルプログラム
    public static void main(String[] args) throws Exception {
    	//ystem.out.println("Start!!");
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	 String str1 = br.readLine();
    	 String A = str1.split(" ")[0];
    	 String B = str1.split(" ")[1];
    	 int plus = add(A,B);
    	 int minus = subtract(A,B);
    	 int kakeru = multiply(A,B);
    	 
    	 String result=String.valueOf(kakeru);
    	 if (plus >= minus && plus >= kakeru) {
    		 result = String.valueOf(plus);
    	 } else if (minus >= kakeru) {
    		 result = String.valueOf(minus);
    	 }
    	 
    	 System.out.println(result);

    	//System.out.println("End!!");
    }
    
    private static int add(String a, String b) throws Exception{
    	return Integer.parseInt(a) + Integer.parseInt(b);
    }

    private static int subtract(String a, String b) throws Exception {
    	return Integer.parseInt(a) - Integer.parseInt(b);
    }
    
    private static int multiply(String a, String b) throws Exception {
    	return Integer.parseInt(a) * Integer.parseInt(b);
    }
    
    private static int divide(String a, String b) throws Exception {
    	return Integer.parseInt(a) / Integer.parseInt(b);
    }
    
    private static int pow(String a, String b) throws Exception {
    	Double result = Math.pow(Double.parseDouble(a),Double.parseDouble(a));
    	return Integer.parseInt(Double.toString(result));
    }
    
    private static String getBigger(String a, String b) throws Exception {
    	String result = b;
    	if (Integer.parseInt(a) >= Integer.parseInt(b)) {
    		result = a;
    	}
    	return result;
    }
    
    private static double getBigger(double a, double b) throws Exception {
    	double result = b;
    	
    	Double.compare(a, b);
    	if (Double.compare(a, b) > 0) {
    		result = a;
    	}
    	return result;
    }
    // 備忘録
    // int → String  String.valueOf();
    // String → int  Integer.parseInt();
    // BigDecimal → int XXX.intValue();
    // double → BigDecimal new BigDecimal(XXX);
    // setScale BigDecimalの桁まとめ 
    // nBig.setScale(0,BigDecimal.ROUND_DOWN);
    // 絶対値 → Math.abs
    
}