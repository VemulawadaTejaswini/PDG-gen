import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int min = 30;
    for (int i = 0; i < number; i++) {
      int value = sc.nextInt();
      int count = 0;
      while(value % 2 == 0) {
        value /= 2;
        count++;
      }
      if (count < min) {
        min = count;
      }
      
    }
    System.out.println(min);
  }
}