import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int x[] = new int[n];
    int y[] = new int[n];
	int p = 0;
    int q = 0;
    int pc = 0;
    int qc = 0;
    int ans = 0;
    int z = 0;
    int cnt = 0;
    
    for (int i=0; i<n; i++) {
      x[i] = Integer.parseInt(sc.next());
      y[i] = Integer.parseInt(sc.next());
    }

    for (int i=0; i<n; i++) {
      for (int j=0; j<n; j++) {
        if( i==j ) { continue; }
      	p = x[i]-x[j];
        q = y[i]-y[j];
        
        cnt = 0;
        for (int k=0; k<n; k++) {
          for(int l=0; l<n; l++) {
            if (k==l) { continue; }
            pc = x[k]-x[l];
            qc = y[k]-y[l];
            if (pc == p && qc == q) { cnt++; }
          }
        }
        if ( cnt > ans ) { ans = cnt; }
      }
    }

    ans = n - (ans / 2) - 1;
    
    System.out.println(ans);
  }
}
