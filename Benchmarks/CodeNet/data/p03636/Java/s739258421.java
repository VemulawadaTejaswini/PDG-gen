import java.util.*;
import java.math.BigInteger;
class Main{

     public static void main(String []args){
      Scanner scan = new Scanner(System.in);
      String s = scan.next();
      int size =s.length()-2 ;
      System.out.println(s.charAt(0)+""+size+""+s.charAt(s.length()-1));
    }
}