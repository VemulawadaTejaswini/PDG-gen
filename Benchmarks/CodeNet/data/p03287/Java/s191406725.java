import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int M = sc.nextInt();
		int intArray[] = new int[N];

		for(int i = 0;i<intArray.length;i++){
			intArray[i] = sc.nextInt();
		}
			
		int ans = 0;
		for(int i = 0;i<intArray.length;i++){
			BigInteger sum = new BigInteger("0");
			BigInteger z = new BigInteger("0");

			for(int j = i;j<intArray.length;j++){
				BigInteger j_b = new BigInteger(String.valueOf(intArray[j]));
				sum = sum.add(j_b);
				BigInteger N_b = new BigInteger(String.valueOf(M));
				
				BigInteger tmp = sum.remainder(N_b);
				if(tmp.equals(z)){
					ans ++;
				}
			}
		}
		
   		System.out.println(ans);
		
   		sc.close();
        return ;

    }
    
}

