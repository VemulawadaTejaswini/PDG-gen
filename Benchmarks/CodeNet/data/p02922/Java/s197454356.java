import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int cnt = 0;
    while (0 < B) {
      B -= A;
      cnt++;
    }
    System.out.println(cnt);
  }
}
