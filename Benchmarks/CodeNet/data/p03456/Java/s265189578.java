import java.util.*;
public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt()*100;
        int b = sc.nextInt();
        int N = a+b;
        
        for (int i = 1; i * i <= 1_000_000; i++) {
        	if (N == i*i) {
        		System.out.println("Yes");
        		return;
        	}
        }
        
        System.out.println("No");
    }
    
}