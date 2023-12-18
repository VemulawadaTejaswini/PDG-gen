import java.io.*;
import java.util.*;
import java.util.ArrayList;
 
class Main
{
  public static void main (String[] arg)
  {
    Scanner scan = new Scanner(System.in);
    
    String hitachi = scan.next(); //整数   
    
    if(hitachi.contains("hii")){
      System.out.println("No");
    }
     
    else if(hitachi.contains("hi"))
        {
            System.out.println("Yes");
        }
    else{
      System.out.println("No");
    }
  }
}
    