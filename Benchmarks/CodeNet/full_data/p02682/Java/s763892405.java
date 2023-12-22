import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int A= keyboard.nextInt();
		int B= keyboard.nextInt();
		int C= keyboard.nextInt();
		int K= keyboard.nextInt();
		
		int ans =0;
		
		if(A<=K){
			ans = A;
			K -= A;
			if(K!=0 && B<=K){
				//ans += 0;
				K -= B;
				ans -=K;
			}
		}else{
			ans = K;
		}

		System.out.print(ans);
		keyboard.close();	
		
	}
}