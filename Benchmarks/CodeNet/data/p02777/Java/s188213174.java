import java.util.*;
public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    
    String s = sc.next();
    String t = sc.next();
    int a = sc.nextInt();
    int b = sc.nextInt();
    String u = sc.next();
    
    if(s.equals(u)){
      a--;
    }else{
      b--;
    }
    
    String sA = String.valueOf(a);
    String sB = String.valueOf(b);
    
    System.out.println( sA + " " + sB);
  }
}