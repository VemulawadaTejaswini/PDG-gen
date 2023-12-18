import java.util.*;
import java.math.*;
import java.lang.*;
import java.io.*;
 
public class Main{
  public static void main(String args[]) throws IOException{
    Scanner s=new Scanner(System.in);
   
    String ss=s.nextLine();
    String tt=s.nextLine();
    
    int c=0;
    for(int i=0;i<3;i++){
      if(ss.charAt(i)==tt.charAt(i))
        c++;
    }
    System.out.println(c);
  }
}
    
    
  