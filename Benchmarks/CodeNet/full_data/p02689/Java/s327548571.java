import java.util.Scanner;
     
    public class Main {
     
    	public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);
    		int n = sc.nextInt();
    		int m = sc.nextInt();
    		int[] h = new int[n];
    		int[] m = new int[n];
    		for (int i = 0; i < n; i++) {
    			h[i] = sc.nextInt();
    			
    		}
    		int cnt = 0;
    		for (int i = 0; i < m; i++) {
    			int a = sc.nextInt();
    			int b = sc.nextInt();
    			m[a - 1] = Math.max(m[a - 1], h[b - 1]);
    			m[b - 1] = Math.max(m[b - 1], h[a - 1]);
    		}
    		for (int i = 0; i < n; i++) {
    			if (h[i] > m[i]) {
    				cnt++;
    			}
    		}
    		
    		System.out.println(cnt);
    	}
     
    }