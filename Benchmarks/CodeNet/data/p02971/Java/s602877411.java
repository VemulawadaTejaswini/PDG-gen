import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int length = sc.nextInt();
    int[] list = new int[length];
    for (int i = 0; i < length; i++) {
      list[i] = sc.nextInt();
    }
    sc.close();

    for (int i = 0; i < length; i++) {
      int[] temp = Arrays.copyOf(list, list.length);
      temp[i] = 0;
      int max = temp[0];
      for (int l = 0; l < length; l++) {
        if (max < temp[l]) {
          max = temp[l];
        }
      }
      System.out.println(max);
    }
  }

} 