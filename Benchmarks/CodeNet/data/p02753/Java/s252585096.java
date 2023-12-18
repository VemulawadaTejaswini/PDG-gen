import java.io.*;
import java.util.*;
 
class Main
{
  public static void main (String[] arg)
  {
    Scanner scan = new Scanner(System.in);
    String mng = scan.next(); //整数
    
    String ans_A = "AAA";
    String ans_B = "BBB";
    
    if(mng.equals(ans_A)){
      System.out.println("No");
    }
    else if(mng.equals(ans_B)){
      System.out.println("No");
    }
    else{
      System.out.println("Yes");
    }
    
  }
}