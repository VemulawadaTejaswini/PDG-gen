import java.util.*;
public class Main{   
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int yen = sc.nextInt();
      int s = yen/1000-n;
      for(int i = 0;i<= Math.min(s/9,n);i++){
      	for(int j = 0;j<= Math.min(n-i,s/4);j++){
        	if(i*9+j*4==s){
            	System.out.println(i+" "+j+" "+(n-i-j));
                return;
            }
        }
      }
      System.out.println((-1)+" "+(-1)+" "+(-1));
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