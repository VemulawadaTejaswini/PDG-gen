import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    long k = Long.parseLong(sc.next());
    long ans = 0;
    int n = s.length();
    String c[] = new String[n];
    int ren = 1;
    int stock = 0;
	int first = 1;
    int last = 1;
    
    for(int i= 0; i < n; i++) {
      c[i] = s.substring(i, i+1);
    }

    // all pat
    for(int i=1; i<n; i++) {
      if(c[i].equals(c[i-1])) {
        ren++;
      }
    }
    
    if (ren == n) {
      if ((long)n * k % 2 == 0) {
        System.out.println(((long)n * k)/2);
      } else {
        System.out.println(((long)n * k - 1)/2);
      }
      return;
    }
    
    ren = 1;
    
    // FIRST not equal LAST
    if(!c[0].equals(c[n-1])) {
      for(int i=1; i<n; i++) {
        if(c[i].equals(c[i-1])) {
          ren++;
        } else {
          if(ren%2 == 0) {
            stock += ren/2;
          } else {
            stock += (ren-1)/2;
          }
          ren = 1;
        }
      }
      ans = stock * k;
      System.out.println(ans);
      return;
    } else { // equal
      
      // look F & L
      for(int i=1; i<n; i++) {
        if(c[i].equals(c[i-1])) {
          ren++;
        } else {
          first = ren;
          ren = 1;
          break;
        }
      }
      for(int i=1; i<n; i++) {
        if(c[n-i-1].equals(c[n-i])) {
          ren++;
        } else {
          last = ren;
          ren = 1;
          break;
        }
      }
      
      long conn = first + last;
      long aconn = 0;
      if(conn%2 == 0) {
        aconn = conn/2;
      } else {
        aconn = (conn-1)/2;
      }
      
      for(int i=first; i<n-last+1; i++) {
        if(c[i].equals(c[i-1])) {
          ren++;
        } else {
          if(ren%2 == 0) {
            stock += ren/2;
          } else {
            stock += (ren-1)/2;
          }
          ren = 1;
        }
      }
      
      int af = 0;
      int al = 0;
      if(first>1){
        if(first%2==0){
          af = first / 2;
        } else {
          af = (first-1) / 2;
        }
      }
      if(last>1){
        if(last%2==0){
          al = last / 2;
        } else {
          al = (last-1) / 2;
        }
      }
      
      ans = (long)stock * k + aconn * (k-1) + af + al;
      System.out.println(ans);

    }
    
  }
}
