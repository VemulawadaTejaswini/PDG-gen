import java.util.*;
public class Main{   
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int[] p = new int[m];
      String[] s = new String[m];
      int[] cnt = new int[n];
      int pena = 0;
      int ac = 0;
      for(int i=0;i<m;i++){
        p[i]=sc.nextInt();
        s[i]=sc.next();
        if(s[i].equals("WA")&&cnt[p[i]]==0)pena++;
        else if(s[i].equals("AC")&&cnt[p[i]]==0){
          cnt[p[i]]++;
          ac++;
        }
      }
      System.out.println(ac+" "+pena);
    }
    public static int lcm(int x, int y){
      return x*y/gcd(x,y);
    }
    public static int gcd(int x, int y){
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