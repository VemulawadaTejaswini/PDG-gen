import java.util.*;

public class Main {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int y = sc.nextInt();
    int a = y / 10000;
    int b;
    int c;
    loop: for(int i = a; i >= 0; i--) {
      b = (y - 10000 * i) / 5000;
      for(int j = b; j >= 0; j--) {
        c = (y - 10000 * i - 5000 * j) / 1000;
        if(i + j + c == n) {
           System.out.println(i + " " + j + " " + c);
           break loop;
        }
      }
      if(i == 0) {
        System.out.println(-1 + " " + -1 + " " + -1);
      }
    }
  }
}
