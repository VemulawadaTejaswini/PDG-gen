import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    switch (S) {
      case "AAA":
      case "BBB":
        System.out.println("No");
        break;
      case "AAB":
      case "ABA":
      case "BAA":  
      case "BBA":
      case "BAB":
      case "ABB":
        System.out.println("Yes");
        break;
    }
  }
}