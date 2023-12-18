import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] v = new int[n];
    int count = 0;

    for (int i = 0;i < n;i++) {
      v[i] = sc.nextInt();
    }

    for (int i = 0;i < n-2;i++) {
      if (v[i] != v[i+1]) {

        if (v[i] == v[i+2]) {
          continue;
        } else {
          count++;
        }

      } else {

        count++;

      }
    }


    System.out.println(count);
  }

}
