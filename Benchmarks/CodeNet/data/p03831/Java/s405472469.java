import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long a = sc.nextLong();
    long b = sc.nextLong();
    long[] x = new long[n];
    for(int i = 0;i < n;i++)x[i]=sc.nextLong();
    long ans = 0;
    for(int i = 1;i < n;i++){
      long dx = x[i]-x[i-1];
      if(dx*a<b)ans+=dx*a;
      else ans+=b;
    }
    System.out.println(ans);
  }
}