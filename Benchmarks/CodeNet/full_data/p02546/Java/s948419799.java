import java.util.Scanner;

public class Main { 
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String s = scanner.nextLine();
    scanner.close();

    if (s.charAt(s.length() - 1) != 's'){
      s = s + "s";
    } else {
      s = s + "es";
    }

    System.out.println(s);
  }
}