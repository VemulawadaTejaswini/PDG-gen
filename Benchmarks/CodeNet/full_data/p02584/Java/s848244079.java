import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(in);
    long x,k,d;
    x = abs(sc.nextLong());
    k = sc.nextLong();
    d = sc.nextLong();
    
    long devide = x/d;
    
    if(x - k*d >= 0){
      out.println(x - k*d);
      
    }else if((k - devide) %2 == 0){
      out.println(x % d);
      
    }else{
      out.println(d - x%d);
    }
    sc.close();
  }
}
