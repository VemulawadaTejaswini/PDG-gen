import java.util.*;

public class sample {
  public static void main(String[] args) {
    System.out.println("整数を入力してください．");
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int X = sc.nextInt();
    int cnt = 0;
    sc.close();
    for (int i = 0; i <= A; i++) {
      for (int j = 0; j <= B; j++) {
        for (int k = 0; k <= C; k++) {
          if (i * 500 + j * 100 + k * 50 == X) {
            cnt++;
          }
        }
      }
    }
    System.out.println(cnt);
  }
}
