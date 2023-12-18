import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long a = sc.nextInt();
    long b = sc.nextInt();
    long[] x = new long[n];
    for(int i=0;i<n;i++){
      x[i] = sc.nextInt();
    }
    long ans = 0;
    for(int i=0;i<n-1;i++){
      long delta = a*(x[i+1]-x[i]);
      ans += Math.min(delta,b);
    }
    System.out.println(ans);
  }
}