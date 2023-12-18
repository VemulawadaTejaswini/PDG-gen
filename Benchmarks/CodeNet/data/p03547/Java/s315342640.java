import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String x = sc.next();
    String y = sc.next();
    String ans[] = {"<", "=", ">"};
    System.out.println(ans[x.compareTo(y)+1]);
  }
}
