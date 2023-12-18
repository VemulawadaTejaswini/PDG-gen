import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int P = sc.nextInt();
    int Q = sc.nextInt();
    int R = sc.nextInt();

    int PQ = P+Q;
    int QR = Q+R;
    int PR = P+R;

    int[] list = {PQ,QR,PR};

    int min = 100;
    for (int i = 0; i < list.length; i++) {
      if(list[i] < min) {
        min = list[i];
      }
    }

    System.out.println(min);
  }
}