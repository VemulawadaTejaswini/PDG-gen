import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int health1 = sc.nextInt();
    int strength1 = sc.nextInt();
    int health2 = sc.nextInt();
    int strength2 = sc.nextInt();
    while (health1 > 0 && health2 > 0) {
      health1 -= strength2;
      health2 -= strength1;
    }
    if (health1 >= 0) {
      System.out.println("No");
    } else {
      System.out.println("Yes");
    }
  }
}