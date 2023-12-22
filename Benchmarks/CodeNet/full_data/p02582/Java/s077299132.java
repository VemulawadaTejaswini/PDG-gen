import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.next();
    sc.close();
    if("SSS".equals(input)){
      System.out.println(0);
    } else if("RRS".equals(input) || "SRR".equals(input)){
      System.out.println(2);
    } else if("RRR".equals(input)){
      System.out.println(3);
    } else {
      System.out.println(1);
    }
  }
}