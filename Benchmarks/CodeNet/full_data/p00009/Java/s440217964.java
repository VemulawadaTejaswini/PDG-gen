// 素数判定
import java.math.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		while(true){
			// キーボード入力
			Scanner sc = new Scanner( System.in );
			int n = sc.nextInt();
			int count = 0;
			for(int i=1;i<=n;i++){
				// 素数判定
				BigInteger bi = new BigInteger( String.valueOf(i) );
				if( bi.isProbablePrime( 10000 ) ){
					count++;
				}
			}
			System.out.println(count);
		}
	}
}