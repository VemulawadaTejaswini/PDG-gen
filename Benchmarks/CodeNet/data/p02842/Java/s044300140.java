import java.util.*;
public class Main{   
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      for(int i=1;i<=50000;i++){
        double t = i*1.08;
        if((int)t==n){
          System.out.println(i);
          return;
        }
      }
      System.out.println(":(");
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