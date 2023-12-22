import java.util.*;
import java.lang.*;
import java.io.*;

class Test{
  
  public static void main(String[] args){
    
    Scanner s = new Scanner(System.in);
    int d = s.nextInt();
    int t = s.nextInt();
    int s = s.nextInt();
    
    int time = d/s;
    
    if(time <= t)
      System.out.println("Yes");
    else
      System.out.println("No");
    
  }
  
}