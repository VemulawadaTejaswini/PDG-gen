import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int block = 0;
    int brokenBlock = 0;
    boolean isSatisfied = false;
    for (int i = 0; i < a; i++) {
      int b = sc.nextInt();
      if (b == block + 1) {
        isSatisfied = true;
        block++;
      } else {
        brokenBlock++;
      }
    }
    if (isSatisfied) {
      System.out.println(brokenBlock);
    } else {
      System.out.println(-1);
    }
  }
}
