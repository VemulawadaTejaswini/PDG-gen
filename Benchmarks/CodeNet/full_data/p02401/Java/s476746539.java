import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    while (true) {
      int x = in.nextInt();
      char op = in.next().charAt(0);
      if(op == '?') break;
      int y = in.nextInt();
      switch (op) {
        case '+': System.out.println(x + y); break;
        case '-': System.out.println(x - y); break;
        case '*': System.out.println(x * y); break;
        case '/': System.out.println(x / y); break;
      }
    }
  }
}