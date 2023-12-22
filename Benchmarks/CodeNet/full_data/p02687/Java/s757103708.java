import java.util.Scanner;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    String word = sc.next();

    if("ABC".equals(word)) {
    	System.out.println("ARC");
    } else {
    	System.out.println("ABC");
    }

  }
}