import java.util.*;
public class Main{   
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String[] s = new String[n];
      int[] t = new int[n];
      for(int i=0;i<n;i++){
        s[i]=sc.next();
        t[i]=sc.nextInt();
      }
      String z = sc.next();
      int sum = 0;
      int idx = 0;
      for(int i=0;i<n;i++){
        if(s[i].equals(z)){
          idx=i;
          break;
        }
      }
      for(int i=idx+1;i<n;i++)sum+=t[i];
      System.out.println(sum);
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