import java.util.*;
import java.math.*;
 
public class Main { //クラス名はMain
    public static void main(String[] args) {
      //整数の入力
      Scanner sc = new Scanner(System.in);
      String S = sc.next();
      
      int count = 0;
      BigInteger b2 = new BigInteger("2019");
      BigInteger b3 = new BigInteger("0");
      for(int i=0;i<=S.length()-4;i++){
          for(int j=i+4;j<=S.length();j++){
              BigInteger wareruka = new BigInteger(S.substring(i,j));
              BigInteger b1 = wareruka.remainder(b2);
              
              if(b1.equals(b3)){
                  count++;
              }
          }
      }
 
      System.out.println(count);
    }
}