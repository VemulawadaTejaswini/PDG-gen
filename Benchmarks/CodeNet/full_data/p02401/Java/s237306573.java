import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    boolean flag = false;
    Scanner sc = new Scanner(System.in);
    while (flag == false) {
      int a = sc.nextInt();
      String op = sc.next();
      int b = sc.nextInt();
      switch (op) {
      case "+":
        System.out.println(a+b);
        break;
      case "-":
        System.out.println(a-b);
        break;
      case "*":
        System.out.println(a*b);
        break;
      case "/":
        System.out.println(a/b);
        break;
      case "?":
        flag = true;
        break;
      }
    }
  }
}

