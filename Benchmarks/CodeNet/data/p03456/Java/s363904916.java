import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner scanner = new Scanner(System.in);
    String a = scanner.next();
    String b = scanner.next();
    int num = Integer.parseInt(a + b);

    Double d = Math.sqrt(num);
    String dStr = d.toString();
    String sp[] = dStr.split("\\.");

    if(sp[1].equals("0")) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }

}
