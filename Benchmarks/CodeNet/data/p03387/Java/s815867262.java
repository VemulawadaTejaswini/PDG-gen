import java.util.*;
public class Main{   
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int max = Math.max(a,Math.max(b,c));
      if(a%2==b%2&&b%2==c%2)System.out.println((max*3-a-b-c)/2);
      else if(b%2==c%2){
      	b++;
        c++;
        max = Math.max(a,Math.max(b,c));
        System.out.println((max*3-a-b-c)/2+1);
      }else if(a%2==c%2){
      	a++;
        c++;
        max = Math.max(a,Math.max(b,c));
        System.out.println((max*3-a-b-c)/2+1);
      }else{
      	a++;
        b++;
        max = Math.max(a,Math.max(b,c));
        System.out.println((max*3-a-b-c)/2+1);
      }
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