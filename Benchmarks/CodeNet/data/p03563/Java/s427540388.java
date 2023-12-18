import java.util.*;
public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        for (int i = -4500; i < 4501; i++) {
        	if ((N+i) / 2 == M) {
        		System.out.println(i);
        	}
        }
    }
}