import java.io.*;
import java.util.*;
import java.util.ArrayList;
 
class Main
{
  public static void main (String[] arg)
  {
    Scanner scan = new Scanner(System.in);
    
    long a = Long.parseLong(scan.next()); //a
    long b = Long.parseLong(scan.next()); //b
    long c = Long.parseLong(scan.next()); //c
    
    double left = Math.sqrt(a) + Math.sqrt(b);
    double right = Math.sqrt(c);
    
    if(left < right){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}
   /* 
    if((- 1) * (a - b) * (a - b) <
      c * ( c - 2 * ( a + b ))){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}*/