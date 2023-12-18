
Submission #1761416
Source code

    import java.util.Scanner;
     
    public class Main {
     
    	public static void main(String[] args) {
    		try (Scanner sc = new Scanner(System.in)) {
    			int n = sc.nextInt();
    			int z = sc.nextInt();
    			int w = sc.nextInt();
     
    			int[] a = new int[n];
    			for (int i = 0; i < n; i++) {
    				a[i] = sc.nextInt();
    			}
     
    			int x = Math.abs(a[n - 1] - w);
    			int y = x;
    			if (1 < n) {
    				y = Math.abs(a[n - 2] - a[n - 1]);
    			}
     
    			if (x < y) {
    				System.out.println(y);
    			} else {
    				System.out.println(x);
    			}
    		}
    	}
    }