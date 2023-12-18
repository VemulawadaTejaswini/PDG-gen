import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    String c = sc.next();
    if(a.substring(a.length()-1,a.length()).equals(b.substring(b.length()-1,b.length()))&&b.substring(b.length()-1,b.length()).equals(c.substring(c.length()-1,c.length()))){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }

  }
  

  
}
