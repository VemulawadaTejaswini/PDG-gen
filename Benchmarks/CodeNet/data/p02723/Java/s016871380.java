import java.util.*;
public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    //
    String a = sc.next();
    String b = a.substring(2, 3);
    String c = a.substring(3, 4);
    String d = a.substring(4, 5);
    String e = a.substring(5, 6);
    
    String ans = "No";
    
    if(b.equals(c) && d.equals(e)){
      ans = "Yes";
    }
    
    System.out.println(ans);
  }
}
