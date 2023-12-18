import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int in[] = new int[a];

    for (int i = 0; i < in.length; i++) {
      in[i] = sc.nextInt();
    }
    int cost = 0;

    int count1 = 0;
    for (int j = 0; j < a; j++) {
      int count2 = 0;
      int resultCal[] = new int[a - 1];

      for (int k = 0; k < in.length; k++) {
        if (count1 == k) {
          continue;
        }
        resultCal[count2] = in[k];
        count2++;
      }

      for (int l = 0; l < resultCal.length; l++) {
        if (l == 0) {
          cost += Math.abs(0 - resultCal[l]);
        } else if (l == (resultCal.length - 1)) {
          cost += Math.abs(resultCal[l - 1] - resultCal[l]);
          cost += Math.abs(resultCal[l]);
        } else {
          cost += Math.abs(resultCal[l - 1] - resultCal[l]);
        }
      }
      System.out.println(cost);
      cost = 0;
      count1++;
    }
  }
}
