import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

  public static void main(String[] args) {

    int[][] cookingTime = new int[5][3];
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      for (int i = 0; i < 5; i++) {
        BigDecimal tmp = new BigDecimal(br.readLine());

        cookingTime[i][0] = tmp.intValue();
        cookingTime[i][1] = tmp.setScale(-1, RoundingMode.UP).intValue();
        cookingTime[i][2] = cookingTime[i][1] - cookingTime[i][0];
      }
    } catch (IOException e) {
      e.printStackTrace();
      System.exit(1);
    }

    Comparator comparator = new Comparator() {
      @Override
      public int compare(Object o1, Object o2) {
        final int index = 2;

        int[] numA = (int[]) o1;
        int[] numB = (int[]) o2;
        return (Integer.compare(numA[index], numB[index]));
      }
    };

    Arrays.sort(cookingTime, comparator);

    int sum = 0;
    for (int i = 0; i < cookingTime.length; i++) {
      if (i < cookingTime.length - 1) {
        sum += cookingTime[i][1];
      } else {
        sum += cookingTime[i][0];
      }
    }
    System.out.print(sum);

  }
}
