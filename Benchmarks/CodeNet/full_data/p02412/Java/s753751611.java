import java.util.Scanner;

class Main {
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n, x, i, j, k, cnt;
    	
    	while(true) {
    		cnt = 0;
    		n = sc.nextInt();
    		x = sc.nextInt();
    		
    		if(n == 0 && x == 0) break;
    		
    		for(i = 1; i <= n; i++) {
    			for(j =i; j <= n; j++) {
    				for(k = j; k <= n; k++) {
    					if(i != k && k != j && i != j && i + j + k == x) {
    						cnt++;
    					}
    				}
    			}
    		}
    		
    		System.out.println(cnt);
    		
    	}
    }
}
