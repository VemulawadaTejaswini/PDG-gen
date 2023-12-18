import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int num = Integer.parseInt(s.replace("/", ""));
    
    System.out.println((num <= 20190430) ? "Heisei" : "TBD");
  }
}