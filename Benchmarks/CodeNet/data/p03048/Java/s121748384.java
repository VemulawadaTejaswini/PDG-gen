import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long r = sc.nextLong();
    long g = sc.nextLong();
    long b = sc.nextLong();
    long n = sc.nextLong();
    long cnt = 0;
    for(long i = 0;i <= r;i++)
      for(long j = 0;j <= g;j++)
        if(n-i*r-j*g>=0&&(n-i*r-j*g)%b==0)cnt++;
    System.out.println(cnt);
  }
}