import java.util.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
    int answer = 0;

    if (a / 2 + b / 2 < c) {
      answer = a * x + b * y;
    } else {
      if (x < y) {
        if (b < c * 2) {
          answer = c * x * 2 + b * (y - x);
        } else {
          answer = c * y * 2;
        }
      } else {
        if (a < c * 2) {
          answer = c * y * 2 + a * (x - y);
        } else {
          answer = c * x * 2;
        }
      }
    }

    System.out.println(answer);
  }
}
