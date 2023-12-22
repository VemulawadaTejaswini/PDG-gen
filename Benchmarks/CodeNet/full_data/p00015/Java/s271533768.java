import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    Integer.parseInt(input.readLine());
    while (input.ready()) {
      char[] data1 = input.readLine().toCharArray();
      char[] data2 = input.readLine().toCharArray();
      String ans = sumCharArrayNumber(data1, data2);
      if (ans.length() > 80) {
        System.out.println("overflow");
      } else {
        System.out.println(ans.toString());
      }
    }
  }

  public static String sumCharArrayNumber(char[] num1, char[] num2) {
    List<Integer> num1Array = new ArrayList<>();
    List<Integer> num2Array = new ArrayList<>();
    for (char each : num1) {
      num1Array.add(Character.getNumericValue(each));
    }
    for (char each : num2) {
      num2Array.add(Character.getNumericValue(each));
    }
    Collections.reverse(num1Array);
    Collections.reverse(num2Array);

    int sizeDigitDiff = num1Array.size() - num2Array.size();
    if (sizeDigitDiff > 0) {
      for (int i = 0; i < sizeDigitDiff; i++) {
        num2Array.add(0);
      }
    } else if (sizeDigitDiff < 0) {
      for (int i = 0; i < (0 - sizeDigitDiff); i++) {
        num1Array.add(0);
      }
    }
    List<Integer> ansArray = new ArrayList<>();
    ansArray.add(0);
    for (int i = 0; i < num1Array.size(); i++) {
      int tmp = num1Array.get(i) + num2Array.get(i) + ansArray.get(i);
      ansArray.set(i, tmp % 10);
      int upCount = tmp / 10;
      if (i == num1Array.size() - 1 && upCount == 0) {
        break;
      }
      ansArray.add(i + 1, tmp / 10);
    }
    Collections.reverse(ansArray);
    String ans = "";
    for (int each : ansArray) {
      ans += Integer.toString(each);
    }
    return ans;
  }
}