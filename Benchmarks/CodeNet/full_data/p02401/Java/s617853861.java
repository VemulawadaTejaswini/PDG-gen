import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int x = in.nextInt();
    char op = in.next().charAt(0);
    int y = in.nextInt();
    
    switch (op) {
      case '+': System.out.println(x + y); break;
      case '-': System.out.println(x - y); break;
      case '*': System.out.println(x * y); break;
      case '/': System.out.println(x / y); break;
      case '?':                            break;
    }
  }
}