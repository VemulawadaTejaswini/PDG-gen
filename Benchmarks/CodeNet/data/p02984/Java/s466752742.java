import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	int n = Integer.parseInt(sc.next());
    int a[] = new int[n];
    int p[] = new int[n];
    
    for (int i=0; i<n; i++) {
      a[i] = Integer.parseInt(sc.next());
      p[i] = 0;
    }
    
    for (int i=0; i<n; i+=2) {
      p[0] += a[i];
    }
    
    for (int i=1; i<n; i+=2) {
      p[0] -= a[i];
    }
      
    p[n-1] = 2* a[n-1] - p[0];
    for (int i=n-2; i>0; i--) {
      p[i] = 2* a[i] - p[i+1];
    }
    
    String ans = "";

    for (int i=0; i<n; i++) {
      if (i==n-1) {
        ans += p[i];
      } else {
	    ans += p[i] + " ";
      }
    }
    
    System.out.println(ans);

  }
}
