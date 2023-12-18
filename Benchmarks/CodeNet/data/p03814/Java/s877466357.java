import java.util.*;


public class Main{
  public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int ansA = s.indexOf("A");
    int ansB = s.lastIndexOf("Z");
    System.out.println(ansB - ansA + 1);
  }
}
