import java.util.*;
public class Main{   
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[][] a = new int[n][2];
      for(int i=0;i<n;i++){
        int x=sc.nextInt();
        int l=sc.nextInt();
        a[i][0]=x-l;
        a[i][1]=x+l;
      }
      Arrays.sort(a,(u,v) -> Integer.compare(u[1],v[1]));
      int cnt = 0;
      int t = -100000000;
      for(int i=0;i<n;i++){
        if(t<=a[i][0]){
          cnt++;
          t=a[i][1];
        }
      }
      System.out.println(cnt);
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