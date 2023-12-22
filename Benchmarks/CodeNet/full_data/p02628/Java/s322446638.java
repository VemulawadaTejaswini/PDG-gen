import java.util.*;

public class Main {
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int ans = 0;
    
    int[] p = new int[n];
    
    for(int i=0;i<p.length;i++) {
    	p[i] = sc.nextInt();
    }
    
    Arrays.sort(p);
    
    for(int i=0;i<k;i++) {
    	ans += p[i];
    }
    
    System.out.println(ans);
  }
}