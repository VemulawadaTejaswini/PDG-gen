import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    main1();
  }

  private static void main1() {
    Scanner scanner = new Scanner(System.in);
    String line = scanner.next();
    String seikai = "CODEFESTIVAL2016";
    int count = 0;
    for (int i = 0; i < line.length(); i++) {
      if (line.charAt(i) != seikai.charAt(i))
        count++;
    }
System.out.println(count);
    scanner.close();
  }

  private static void main2() {
    Scanner scanner = new Scanner(System.in);
    String line = scanner.next();
    scanner.close();
  }

  private static void main3() {
    Scanner scanner = new Scanner(System.in);
    String line = scanner.next();
    scanner.close();
  }

  private static void main4() {
    Scanner scanner = new Scanner(System.in);
    String line = scanner.next();
    scanner.close();
  }

}