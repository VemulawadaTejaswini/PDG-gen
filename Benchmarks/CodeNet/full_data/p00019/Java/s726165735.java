import java.util.*;
public class Main{
    public static void main(String args[]){
     Scanner sc =new Scanner(System.in);
     int n = sc.nextInt();
    System.out.println(f(n));
   }
    public static int f(int n){
       return n==1?1:n+f(n-1);
    }
}