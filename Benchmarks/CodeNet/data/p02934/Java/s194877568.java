import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    
    int n = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    int a[] = new int[n];
    for(int i=0 ; i<n ; i++) {
      a[i] = Integer.parseInt(st.nextToken());
    }
    
    long lcmans = a[0];
    for(int i=1 ; i<n ; i++) {
      lcmans = lcm(lcmans, a[i]);
    }
    
    long sum = 0;
    for(int i=0 ; i<n ; i++) {
      sum += lcmans/a[i];
    }
    
    System.out.println((double)lcmans/sum);
  }
  
  static long gcd(long a, long b) {
    return (b==0) ? a : gcd(b,a%b);
  }
  
  static long lcm(long a, long b) {
    return (a*b)/gcd(a,b);
  }
}
