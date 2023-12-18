import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int[] cards = new int[number];
    for (int i = 0; i < number; i++) {
      cards[i] = sc.nextInt();
    }
    Arrays.sort(cards);
    int Alice = 0;
    int Bob = 0;
    if (number % 2 == 0) {
      for (int j = 0; j < number; j++) {
        if (j % 2 == 1) {
          Alice += cards[j];
        } else {
          Bob += cards[j];
        }
      }
    } else {
      for  (int j = 0; j < number; j++) {
        if (j % 2 == 0) {
          Alice += cards[j];
        } else {
          Bob += cards[j];
        }
      } 
    }
    System.out.println(Alice - Bob);
  }
}