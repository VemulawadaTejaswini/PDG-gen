import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    String p = scan.nextLine();

    String text = String.join("", s, s);

    for (int i = 0; i < text.length(); i++) {
      if(text.regionMatches(i, p, 0, p.length())) {
        System.out.println("Yes");
        return;
      }
    }
    
    System.out.println("No");
  }

}
