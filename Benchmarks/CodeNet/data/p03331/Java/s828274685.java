import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int min = num;
    for (int i = 1; i <= num / 2; i++) {
      String num1 = String.valueOf(i);
      int num1Length = num1.length();
      char[] num1Char = num1.toCharArray();
      String num2 = String.valueOf(num - i);
      int num2Length = num2.length();
      char[] num2Char = num2.toCharArray();
      int count = 0;
      for (int j = 0; j < num1Length; j++) {
        count += Character.getNumericValue(num1Char[j]);
      }
      for (int k = 0; k < num2Length; k++) {
        count += Character.getNumericValue(num2Char[k]);
      }
      if (count < min) {
        min = count;
      }
      
    }
    System.out.println(min);
  }
}