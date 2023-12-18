import java.util.Scanner;

public class Main {


  /**
   * @param args
   */
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] h = new int[n];
    for (int i = 0; i < n; i++) {
      h[i] = sc.nextInt();
    }

    int returnMax = 0;
    for (int i = 0; i < n - 1; i++) {
      int leftPoint = i;
      int count = 0;
      for (int j = i + 1; j < n; j++) {
        if (h[leftPoint] >= h[j]) {
          leftPoint = j;
          count++;
          if (returnMax < count) {
            returnMax = count;
          }
        } else {
          break;
        }
      }

    }
    System.out.println(returnMax);
  }

}
