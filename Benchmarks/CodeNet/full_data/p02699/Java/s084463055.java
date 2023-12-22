import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int S = sc.nextInt();
    int W = sc.nextInt();
    if (W >= S) {
      System.out.println("unsafe");
    } else {
      System.out.println("safe");
    }
  }
}