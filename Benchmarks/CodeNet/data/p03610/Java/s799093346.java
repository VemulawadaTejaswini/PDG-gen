import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    StringBuilder buf = new StringBuilder();
    
    String s = sc.next();
    String t = "";
    //abcd
   for(int i=0 ; i<s.length() ; i++){
     if(i%2==0){
       String s1 = s.substring(i, i+1);
       buf.append(s1);
       t = buf.toString();
     }
   }
    System.out.println(t);
  }
}