import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		long X = keyboard.nextLong();
		long K = keyboard.nextLong();
		long D = keyboard.nextLong();
		long XX = Math.abs(X);
		
		long ans = XX;
		long count = 0;
		while(XX > D) {
			XX -= D;
			count ++;
		}
		
		if(count>=K) {
			while(K > 0) {
				ans -= D;
				K --;
			}
		}else {
			ans = D;
		}
		
		System.out.print(Math.abs(ans));
		keyboard.close();
	}
}