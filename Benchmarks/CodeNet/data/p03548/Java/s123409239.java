import java.util.*;
import java.math.BigInteger;
class Main{

     public static void main(String []args){
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt() ;
      int a = scan.nextInt() ;
      int b =scan.nextInt() ;
      int t = n/(a+b) ; 
      if(n < t*(a+b)+b){
          System.out.println(t-1);
      }else{
          System.out.println(t);
      }
      }
}