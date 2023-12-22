import java.util.*;

public class Main {
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    
    for(int i=0;i<a.length;i++) {
    	a[i] = sc.nextInt();
    }
    
    int q = sc.nextInt();
    int[] b = new int[q];
    int[] c = new int[q];
    
    for(int i=0;i<b.length;i++) {
    	b[i] = sc.nextInt();
    	c[i] = sc.nextInt();
    }
    
    int ans = 0;
    for(int i=0;i<q;i++) {
    	ans = 0;
    	for(int j=0;j<a.length;j++) {
    		if(a[j] == b[i]) {
    			a[j] = c[i];
    		}
    		ans += a[j];
    	}
    	System.out.println(ans);
    }
  }
}