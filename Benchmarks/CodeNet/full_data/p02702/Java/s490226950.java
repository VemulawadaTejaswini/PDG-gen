import java.util.*;
import java.math.BigInteger;

public class Main {
	

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int len = str.length();
		if(len<4){
			System.out.println(0);
			return;
		}

		int dst = 4;
		long cnt = (long) 0;
		
		while(dst<len+1){

			for(int i = 0; (i+dst)<len+1; i++){
				String substr = str.substring(i, i+dst);
              	BigInteger bigIntegerStr=new BigInteger(substr);
              	BigInteger modnum=new BigInteger("2019");
              	BigInteger ans=new BigInteger("0");
				if(bigIntegerStr.mod(modnum).equals(ans)){
					cnt++;
				}
			}

			dst++;
		}

		System.out.println(cnt);
		return;
	}


}
