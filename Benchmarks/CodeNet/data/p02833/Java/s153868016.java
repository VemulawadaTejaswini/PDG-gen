import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String sn = sc.next();
    long n = Long.valueOf(sn);
    int l = sn.length();
    int fi = Integer.valueOf(sn.substring(l-1, l));
    long ans = 0;
    
    if(fi%2 != 0){
      System.out.println(0);
      return;
    }
    
    long nd = n - (long)fi;
    int c = 0;
    for(int i=1; i<36; i++){
      if(nd < Math.pow(5, i)){
        c = i-1;
        break;
      }
    }
    
    //System.out.println(c);
    
    for(int i=1; i<=c; i++){
      ans += nd / (2*Math.pow(5, i));
    }
    
    System.out.println(ans);
    
  }
  
  public static long gcd(long a, long b) {
    if (b == 0) {
      return a;
    } else {
      return gcd(b,a%b);
    }
  }
}
