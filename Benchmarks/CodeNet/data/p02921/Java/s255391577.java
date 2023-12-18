import java.util.Scanner;

public class Main {

  /**
   * @param args
   */
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String f[] = sc.next().split("");
    String a[] = sc.next().split("");

    int count = 0;
    for (int i = 0; i < 3; i++) {
      if (f[i].equals(a[i])) {
        count++;
      }
    }

    System.out.println(count);
  }

}
