import java.util.*;
import java.math.BigInteger;
class Main{

     public static void main(String []args){
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt() ;
        System.out.println(lucas(n));
      }
      static BigInteger lucas(int n){
          ArrayList<BigInteger> a = new ArrayList<>();
          a.add(new BigInteger("2"));
          a.add(new BigInteger("1"));
          for(int i = 2 ;i <=n ; i++){
              a.add(a.get(i-2).add(a.get(i-1)));
          }
          return a.get(n);
      }
}