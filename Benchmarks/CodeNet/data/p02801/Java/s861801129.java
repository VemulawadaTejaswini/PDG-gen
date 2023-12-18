import java.util.*;
public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    
    String aStr = sc.next();
    
    char[] aChr = aStr.toCharArray();
    
    aChr[0]++;
    
    System.out.println(aChr[0]);
  }
}