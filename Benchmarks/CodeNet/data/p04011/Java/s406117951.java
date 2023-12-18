import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      
        // k日まではx円
        // (n-k)日の間はy円
        // つまり、 (K * x) + (N - K) * y 
        // N > K の場合がある、この場合は処理を変えて単に N * K 
      
        int n = sc.nextInt();
        int k = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
      
        int price = 0;
     
        if (n > k) {
          price =  ((k * x) + ((n - k ) * y));
        } else {
          price = (n * x);
        }
        
      
        System.out.println(price);
	} 
}