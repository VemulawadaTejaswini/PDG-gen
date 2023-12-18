import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong() -1;
    long B = sc.nextLong();
    long C = sc.nextLong();
    long D = sc.nextLong();
    long E = lcm(C,D);
    
    long big = B - B/C - B/D + B/E;
    long small = A -A/C -A/D + A/E;
    System.out.println(big-small);
    
  }
  private static long lcm(long m,long n){
    return m*n/gcd(m,n);
  }
  private static long gcd(long m,long n){
    if (m<n) return gcd(n,m);
    if (n==0) return m;
    return gcd(n,m%n);
  }
}