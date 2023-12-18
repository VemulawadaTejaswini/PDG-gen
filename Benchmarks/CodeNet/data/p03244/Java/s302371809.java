import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] v = new int[n];
    for (int i = 0; i < n; i++) {
      v[i] = sc.nextInt();
    }
    int min = n - 2;
    boolean is = false;
    for (int i = 0; i < n - 1; i += 2) {
      if (v[i] != v[i + 1]) {
        is = true;
        int count = 0;
        for (int j = 0; j < n; j += 2) {
          if (v[i] != v[j]) {
            count++;
          }
        }
        for (int j = 1; j < n; j += 2) {
          if (v[i + 1] != v[j]) {
            count++;
          }
        }
        if (count < min) {
          min = count;
        }
      }
    }
    System.out.println(is ? min : n / 2);
  }

}
