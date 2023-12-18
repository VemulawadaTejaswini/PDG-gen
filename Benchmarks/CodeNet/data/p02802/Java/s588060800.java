import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int pena = 0;//間違え
    boolean[] c = new boolean[n];//正答
    String a = "";
	for (int i = m; i > 0; i--) {
      int d = sc.nextInt() - 1;
      a = sc.next();
      if (a.equals("WA")) {
        if (!c[d]) {
        pena++;
        }
      } else {
        if (!c[d]) {
          c[d] = true;
        }
      }
    }
    int e = 0;
    for (boolean f: c) {
      if (f) {
        e++;
      }
    }
    System.out.println(e + " " + pena);
  }
}