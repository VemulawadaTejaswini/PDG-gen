import java.util.*;
public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int odd = 0;
        int even = 0;
        for (int i = 0; i < N; i++) {
        	int a = sc.nextInt();
        	if (a % 2 == 0) {
        		even++;
        	} else {
        		odd++;
        	}
        }
        
        even += odd / 2;
        odd = odd % 2;
        
        if (odd == 1) {
        	System.out.println("NO");
        	return;
        }
        
        while(even > 1) {
        	if (even % 2 == 0) {
        		even /= 2;
        	}
        }
        
        System.out.println(even == 1 ? "YES" : "NO");
    }
}