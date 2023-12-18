import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    String N = sc.next();
    String first = N.substring(0,1);
    String second = N.substring(1,2);
    String third = N.substring(2,3);
    if(first.equals("7") || second.equals("7") || third.equals("7")){
        System.out.println("Yes");
    } else {
        System.out.println("No");
    }
  }
}