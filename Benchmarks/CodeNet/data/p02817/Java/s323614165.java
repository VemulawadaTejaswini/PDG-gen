import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    StringBuilder buf = new StringBuilder();
    buf.append(t);
    buf.append(s);
    System.out.println(buf);
  }
}