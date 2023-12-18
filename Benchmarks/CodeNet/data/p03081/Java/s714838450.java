import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int Q = sc.nextInt();
    	String s = sc.next();
    	
    	int[] cnt = new int[N];
    	int[] a = new int[N];
    	Arrays.fill(cnt, 1);
    	
    	for( int i = 0; i < Q; i++ ) {
    		String t = sc.next();
    		String d = sc.next();
    		Arrays.fill(a, 0);
    		
    		for( int j = 0; j < N; j++ ) {
    			if( s.charAt(j) == t.charAt(0) ) {
    				if( d.equals("L") && j - 1 >= 0 ) {
    					a[j-1] += cnt[j];
    				}
    				else if( d.equals("R") && j + 1 <=  N-1 ) {
    					a[j+1] += cnt[j];
    				}
    			}
    			else {
    				a[j] += cnt[j];
    			}
    			
    		}
    		for( int j = 0; j < N; j++ ) {
    			cnt[j] = a[j];
    		}
    	}
    	int sum = 0;
		for( int j = 0; j < N; j++ ) {
			sum += cnt[j];
		}
		System.out.println( sum );
    	
    	sc.close();
    }
}