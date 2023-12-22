import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
     BigInteger b1 = new BigInteger("1");
      BigInteger b3 ;
    while(n-->0){
        b3 = new BigInteger(sc.next().trim());
        //System.out.println(b3);
        b1 = b1.multiply(b3);
    }
 //   BigInteger b2 = new BigInteger("1000000000000000000");
  //  System.out.println();
  //BigInteger n1 = b2.divide(b1);
  String s = String.valueOf(b1);
 // System.out.println(n1);
    if(b1.toString().length()>18 && s.charAt(s.length()-1)!='0')
        System.out.println("-1");
    else
        System.out.println(b1);
    
   
   
   
   
   
    
   
  }
}
