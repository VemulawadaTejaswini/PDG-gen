import java.util.*;
public class Main {
	public static void main(String... args) {
    	Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
        	a[i] = input.nextInt();
		}
        
        int ans = 0;
        for (int i = 0; i < n; i++) {
        	for (int j = i + 1; j < n; j++) {
            	for (int k = j + 1; k < n; k++) {
                	if (valid(a[i], a[j], a[k])) {
                    	ans++;
                    }
				}
            }
		}
        
        System.out.println(ans);
	}
    
    private static boolean valid(int a, int b, int c) {
    	if (a == b || b == c || c == a) {
        	return false;
		}
        
        if (a + b <= c || b + c <= a || c + a <= b) {
        	return false;
		}
        
        return true;
	}
}
