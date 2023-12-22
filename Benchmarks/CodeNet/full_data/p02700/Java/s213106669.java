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
    while (true) {
      health2 -= strength1;
      if ( health2 <= 0) break;
      health1 -= strength2;
      if (health1 <=0) break;
    }
    if (health1 > health2) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}