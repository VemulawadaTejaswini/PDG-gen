import java.util.*;
import java.lang.*;
import java.math.BigInteger;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long n = sc.nextLong();
        BigInteger count = BigInteger.ONE;
      	long z = (long)Math.pow(10, 18);
      	BigInteger check = BigInteger.ONE;
      	check = check.multiply(BigInteger.valueOf(z));
        int i;
      	
        try{
      		for(i = 0;i < n; i++){
              count = count.multiply(BigInteger.valueOf(sc.nextLong()));
              	//10の18乗を超えた時
            	if(count.compareTo(check) > 0){
                  	//強引にキャッチさせる構文にする
                  	for(i = 0;i <= n ; i++){
                      if(sc.nextLong() == 0){
                        System.out.println(0);
              		    System.exit(0);                        
                      }
                    }
       			 }
        	}
        }catch (NoSuchElementException e){
            System.out.println(-1);
          	System.exit(0);
        }

      	 System.out.println(count);
    }
}