import java.util.*;
public class Main{   
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      long n = sc.nextLong();
      long m = sc.nextLong();
      char[] s = sc.next().toCharArray();
      char[] t = sc.next().toCharArray();
      long l = lcm(n,m);
      Map<Long,Character> map = new HashMap<>();
      for(long i=0;i<n;i++)map.put((l/n)*i+1,s[(int)i]);
      for(long i=0;i<m;i++){
        if(map.containsKey((l/m)*i+1)&&t[(int)i]!=map.get((l/m)*i+1)){
          System.out.println(-1);
          return;
        }
      }
      System.out.println(l);
    }
    public static long lcm(long x, long y){
      return x*y/gcd(x,y);
    }
    public static long gcd(long x, long y){
      if(x < y)return gcd(y,x);
      if(y==0)return x;
      return gcd(y,x%y);
    }
}
class Pair{
    int a,b;

    Pair(int a, int b){
      this.a = a;
      this.b = b;
    }
}