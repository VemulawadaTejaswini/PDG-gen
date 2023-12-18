import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		String s = sc.next();
		
		// 計算
		int result = 0;
		
		for(int i = 0; i < 1000; i++){
		    int a = i/100;
		    int b = (i%100)/10;
		    int c = i%10;
		    //System.out.println(a + " " + b + " " + c);
		    int indexA = s.indexOf(String.valueOf(a));
		    if(indexA >= 0){
		        int indexB = s.indexOf(String.valueOf(b), indexA + 1);
		        if(indexB > 0){
		            int indexC = s.indexOf(String.valueOf(c), indexB + 1);
		            if(indexC > 0) result++;
		        }
		    }
		    //String r = ".*" + a + ".*" + b + ".*" + c + ".*";
		    //boolean bool = s.matches(r);
		}
		
		// 出力
		System.out.println(result);
	}
}
