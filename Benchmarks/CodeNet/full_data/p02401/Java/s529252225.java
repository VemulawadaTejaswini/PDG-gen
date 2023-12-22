import java.util.*;

class Main{
  static int a,b,i,ans;
  static String op;
    
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (op != "?") {
    a = sc.nextInt();
    op = sc.next();
    b = sc.nextInt();
    if (op.equals("?")) {
      break;
    } else if (op.equals("+")) {
        ans = a + b;
        System.out.println(ans);
    } else if (op.equals("-")) {
        ans = a - b;
        System.out.println(ans);
    } else if (op.equals("*")) {
        ans = a * b;
        System.out.println(ans);
    } else if (op.equals("/")) {
        ans = a / b;
        System.out.println(ans);
    } else {
        break;
    }
  }
}
}

