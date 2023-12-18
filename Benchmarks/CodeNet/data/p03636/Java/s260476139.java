import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String first = s.substring(0,1),last = s.substring(s.length()-1,s.length());
    int a = s.length() - 2;
    System.out.println(first + a + last);
  }
}
