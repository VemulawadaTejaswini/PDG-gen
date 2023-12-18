import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int max = -1000;

    int[] data = {a+b,a-b,a*b};

    for (int i = 0; i < 3; i++) {
      max = Math.max(max,data[i]);
    }

    System.out.println(max);

  }
}
