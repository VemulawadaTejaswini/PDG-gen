import java.util.*;

public class Main {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int y = sc.nextInt();
    int a = y / 10000;
    int b = y / 5000;
    int c = y / 1000;
    
    loop: for(int i = 0; i < a + 1; i++) {
      for(int j = 0; j < b + 1; j++) {
        for(int k = 0; k < c + 1; k++) {
          if(10000 * i + 5000 * j + 1000 * k == y && i + j + k == n) {
            System.out.println(i + " " + j + " " + k);
            break loop;
          }
        }
      }
      if(i == a) {
        System.out.println(-1 + " " + -1 + " " + -1);
      }
    }
  }
}
