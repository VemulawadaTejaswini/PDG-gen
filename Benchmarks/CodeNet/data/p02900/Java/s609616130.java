import java.util.*;
public class Main{   
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      long a = sc.nextLong();
      long b = sc.nextLong();
      long g = gcd(a,b);
      System.out.println(1+primeNum(g));
    }
    public static long gcd(long x, long y){
      if(x < y)return gcd(y,x);
      if(y==0)return x;
      return gcd(y,x%y);
    }
  public static long primeNum(long x){
    boolean[] tag = new boolean[(int)x+1];
    Arrays.fill(tag,true);
    tag[0]=false;
    tag[1]=false;
    long cnt = 0;
    for(int i = 2;i <= (int)Math.sqrt(x);i++){
      if(tag[i]){
        for(int j = i;j <= x;j+=i)tag[j]=false;
        if(x%i==0)cnt++;
      }
    }
    return cnt;
  }
}