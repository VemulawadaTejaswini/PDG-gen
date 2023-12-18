import java.util.*;

public class Main{
  public static void main (String[] args){
   Sccaner sc = new Sccaner(System.in);
    
   int a = sc.nextInt();
   String s = sc.next();
    
   if(a >= 3200){
   	s = "red";
   }
    
   System.out.println(s)
  }
}