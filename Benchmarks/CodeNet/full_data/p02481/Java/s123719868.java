import java.io.*;
import java.util.*;
import java.text.*;
import java.math.BigInteger;
import java.math.BigDecimal;

public class Main{
	//for(Map.Entry<Object, Object> e: map.entrySet()){ ...
	public static void main(String[] args){
		try{
//-*-*- tp start -*-*-
			final int INF = Integer.MAX_VALUE, MINF = Integer.MIN_VALUE;
			Scanner s = new Scanner(System.in);
//-*-*- tp end -*-*-
			//write a program...
			int a = s.nextInt(), b = s.nextInt();
			debugl((a*b)+" "+((a+b)*2));
			//-*-*- tp start -*-*-
		}catch(Exception e){
			e.printStackTrace();
		}
	}
//-*-*- tp end -*-*-
	//functions
	private static String rep(String x, int n){
		String str = "";
		for(int i = 0; i < n; i++){
			str += x;
		}
		return str;
	}
//-*-*- tp start -*-*-
	private static void debugl(Object obj){
		System.out.println(obj);
	}
	private static void debug(Object obj){
		System.out.print(obj);
	}
	private static String toStrmd(Object[] obj){
		return Arrays.deepToString(obj);
	}
}
//-*-*- tp end -*-*-