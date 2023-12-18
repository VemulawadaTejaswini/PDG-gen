import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int total = sc.nextInt();
    int x = -1;
    int y = -1;
    int z = -1;
    for(int i = 0; i <= number; i++) {
      for(int j = 0; (i + j) <= number; j++) {
          int k = number - i - j;
          if((1000 * i + 5000 * j + 10000 * k) == total) {
            x = i;
            y = j;
            z = k;
          } 
      }
    }
    System.out.println(z + " " + y + " " + x);
    
  }
}