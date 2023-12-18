import java.util.*;
public class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    String c1 = sc.next();
    String c2 = sc.next();
    String c3 = sc.next();

    String c11 = c1.substring(0,1);
    String c22 = c2.substring(1,2);
    String c33 = c3.substring(2,3);

    System.out.println(c11 + c22 + c33);

  }
}