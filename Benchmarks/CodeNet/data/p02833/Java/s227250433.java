import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
      // 整数の入力
      	long result = 0;
		long N = sc.nextLong();
      	long fivefive = 10;
		if(N%2==0){
        	while(N/fivefive>=1){
              result = result +  (long)Math.floor(N/fivefive); 
              fivefive= fivefive*5;
            }
        }
        System.out.println(result);
	}
}