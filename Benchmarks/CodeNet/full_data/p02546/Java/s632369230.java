import java.lang.*; 
import java.util.*;
  
public class Geeks { 
  
    public static void main(String[] args) 
    {
      Scanner sc= new Scanner(System.in);
      String s =sc.nextLine();
      //System.out.println(s.toLowerCase());
      s=s.toLowerCase();
     //if(s.charAt(s.length()-1)=='s')
     if(s.lastIndexOf('s')==s.length()-1)
       s=s+"es";
       // System.out.println(s.lastIndexOf('s')==s.length()-1);
       // System.out.println(s.lastIndexOf('s'));
            //System.out.println(s.length()-1);
     else
       s=s+"s";
      // System.out.println(s.charAt(s.length()-1)); 
      System.out.println(s);
    }
}