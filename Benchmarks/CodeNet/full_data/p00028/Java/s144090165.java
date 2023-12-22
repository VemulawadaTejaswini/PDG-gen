import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    int[] numCount = new int[101];
    ArrayList<Integer> ansSet = new ArrayList<>();
    Arrays.fill(numCount, 0);
    while (input.ready()) {
      int data = Integer.parseInt(input.readLine());
      numCount[data]++;
    }
    int tmp = 0;
    for (int i = 0; i < numCount.length; i++) {
      if (numCount[i] == 0)
        continue;
      if (tmp > numCount[i]) {
        continue;
      }
      if (tmp < numCount[i]) {
        tmp = numCount[i];
        ansSet.clear();
        ansSet.add(i);
        continue;
      }
      if (tmp == numCount[i]) {
        ansSet.add(i);
      }
    }

    for (int i : ansSet) {
      System.out.println(i);
    }
  }

}