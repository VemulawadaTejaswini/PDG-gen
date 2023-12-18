import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    s += sc.next();
    int a = Integer.parseInt(s);
    double d = Math.sqrt(a);
    String ds = Double.toString(d);
    int dotindex = ds.indexOf(".");

    if (ds.substring(dotindex + 1).replaceAll("0", "").isEmpty()) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }
}