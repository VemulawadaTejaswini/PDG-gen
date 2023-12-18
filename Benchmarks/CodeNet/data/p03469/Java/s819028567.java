import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String a[] = new String[3];
    a = s.split("/",0);
    a[0] = "2018";
    String ans = String.join("/",a);
    System.out.println(ans);
  }
}
