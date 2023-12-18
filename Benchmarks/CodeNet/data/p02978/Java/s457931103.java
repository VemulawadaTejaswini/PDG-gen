import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

		BigInteger n1  = BigInteger.valueOf(1);

		Scanner sc = new Scanner(System.in);
		// 整数の入力
		BigInteger A = sc.nextBigInteger();
		BigInteger B = sc.nextBigInteger();
		BigInteger C = sc.nextBigInteger();
		BigInteger D = sc.nextBigInteger();
		
		BigInteger A_wari_C = A.divide(C);//AをCでわる最大の数
		if(A.compareTo(A_wari_C.multiply(C)) > 0 ){
			A_wari_C = A_wari_C.add(n1);
		}

		BigInteger A_wari_D = A.divide(D);//AをDでわる最大の数
		if(A.compareTo(A_wari_D.multiply(D)) > 0 ){
			A_wari_D = A_wari_D.add(n1);
		}
		
		BigInteger B_wari_C = B.divide(C);//BをCでわる最大の数
		BigInteger B_wari_D = B.divide(D);//BをDでわる最大の数

		BigInteger ans = B.subtract(A).subtract(B_wari_C.subtract(A_wari_C).add(B_wari_D.subtract(A_wari_D)));
		
		System.out.println(ans);
	    
   		sc.close();
        return ;

    }
    
}

