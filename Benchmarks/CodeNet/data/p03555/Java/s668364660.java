import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	String hoge_src = sc.next();
    String egoh = sc.next();
    
    StringBuffer buff = new StringBuffer(hoge_src);
    String hoge_dst = buff.reverse().toString();
	
    if (egoh.equals(hoge_dst)) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}