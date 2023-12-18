import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int P = sc.nextInt();
    int Q = sc.nextInt();
    int R = sc.nextInt();

    int[] list = {P+Q, R+Q, P+R, Q+R, R+P, Q+P};

    int min = 100;
    for (int i = 0; i < list.length; i++) {
      if(list[i] < min) {
        min = list[i];
      }
    }

    System.out.println(min);
  }
}
