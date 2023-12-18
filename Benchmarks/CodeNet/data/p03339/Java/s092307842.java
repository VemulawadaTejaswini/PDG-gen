import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	// Atcoder用のサンプルプログラム
    public static void main(String[] args) throws Exception {
    	//System.out.println("Start!!");
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


     	/*
     	 * result=300000;
     	 * N繰り返し
     	 * 
     	 * i文字目より左の中にWかいくつあるか　+i文字目より右の中にEかいくつあるか
     	 */

   	 String N = br.readLine();
   	 String S = br.readLine();
	 int Nint = Integer.parseInt(N);

	 int countW = count(S,"W");

   	 int result=300000;
   	 int temp=Nint;
     	for (int i = 1;i <= Nint;i++) {
     		int Wtemp = count(S.substring(0,i-1),"W");
     		int  Etemp;
     		if (S.substring(i-1,i)=="W") {
     			//Wtemp++;
     			Etemp = (Nint -i) - (countW -Wtemp-1);
     		} else {
     			Etemp = (Nint -i) - (countW -Wtemp-1);
     		}
     		//　i-1-wtemp
     		
     		temp = Wtemp + Etemp ; 
     		if (temp < result) {
     			result = temp;
     		}
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
    
    
    
    public static int count(String target, String item) {
        int count = 0;
        int s = 0;
        for (int i = 0;i < target.length();i++) {
        	if (item.equals(String.valueOf(target.charAt(i)))) {
        		count+=1;
        	}
        }
        return count;

    }
}
