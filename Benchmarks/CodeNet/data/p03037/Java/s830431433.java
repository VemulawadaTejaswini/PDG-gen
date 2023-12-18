import java.util.Scanner;

public class Main{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int cnt = 0;
        for(int i = 1; i <= n ; i++) {
        	boolean flag = true;
        	for(int j = 0; j < m; j++) {
        		int l = sc.nextInt();
            	int r = sc.nextInt();
            	if(i < l || r < i) {
            		flag = false;
            	}
        	}
        	if(flag) cnt++;	
        }       	        	
        System.out.println(cnt);
    }
}