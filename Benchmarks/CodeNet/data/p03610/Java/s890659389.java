import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    String s = sc.next();
    String t = "";
    //abcd
   for(int i=0 ; i<s.length() ; i++){
     if(i%2==0){
       String s1 = s.substring(i, i+1);
       t+=s1;
     }
   }
    System.out.println(t);
  }
}