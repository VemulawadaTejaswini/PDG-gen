import java.util.*;
public class Main{   
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      int[] h = new int[n];
      int cnt = 0;
      for(int i = 0;i < n;i++){
        h[i]=sc.nextInt();
        if(k<=h[i])cnt++;
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