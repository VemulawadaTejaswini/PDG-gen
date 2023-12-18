import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
  long a = sc.nextLong();
  long b = sc.nextLong();
  long ans = a+b;
  for(int i = 0;i < N-1;i++){
    long c = sc.nextLong();
    long d = sc.nextLong();
    ans = lcm(ans,c+d);
}
  System.out.println(ans);
}
private static long gcd(long m, long n) {
    if(m < n) return gcd(n, m);
    if(n == 0) return m;
    return gcd(n, m % n);
}

private static long lcm(long m, long n) {
    return m * n / gcd(m, n);
}
}