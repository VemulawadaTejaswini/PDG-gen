import java.util.Scanner;
import java.math.*;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String s = scan.next();
    String sub = "";
    int count = 0;
    for(int i = 0; i < s.length(); i++){
        for(int j = i+1; j < s.length(); j++){
            sub = s.substring(i, j+1);
            BigInteger k = new BigInteger(sub);
            BigInteger m = BigInteger.valueOf(2019);
            if(k.mod(m).equals(BigInteger.valueOf(0))){
                count++;
                break;
                
            }
        }
    }
    System.out.println(count);
  }
}