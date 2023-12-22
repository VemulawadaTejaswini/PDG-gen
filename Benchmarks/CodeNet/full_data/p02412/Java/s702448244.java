import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(true) {
      int count = 0;
      int n = sc.nextInt();
      int x = sc.nextInt();
      if(n == 0 && x == 0) {
        break;
      } else {
        for(int i = 1; i < n + 1; i++) {
          for(int j = 1; j < n + 1; j++) {
            int k = x - i - j;
            if(i != j && i != k && j != k && k < n + 1 && k > 0) {
              count++;
            }
          }
        }
        System.out.println(count / 6);
      }
    }
  }
}

