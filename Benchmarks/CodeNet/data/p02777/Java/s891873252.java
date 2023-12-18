
import java.util.*;
public class Main{
  public static void main(String []args){
  Scanner sc = new Scanner(System.in);

  String s = sc.next();
  String t = sc.next();
  int a = sc.nextInt();
  int b = sc.nextInt();
  String u = sc.next();

  if (u.equals(s)) {
    a-=1;
  }
  if (u.equals(t)) {
    b-=1;
  }
  System.out.print(a);
  System.out.print(" ");
  System.out.print(b);

}
}
