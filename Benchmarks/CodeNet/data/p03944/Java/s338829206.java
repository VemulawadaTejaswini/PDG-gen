import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int w = scanner.nextInt();
    int h = scanner.nextInt();
    int n = scanner.nextInt();
    
    int left = 0;
    int right = w;
    int bottom = 0;
    int top = h;
    
    for(int i = 0; i < n; i++) {
      int x = scanner.nextInt();
      int y = scanner.nextInt();
      int a = scanner.nextInt();
      
      switch(a) {
        case 1:
          // 処理
          if(left < x) {
            left = x;
          }
          break;
        case 2:
          // 処理
          if(right > x) {
            right = x;
          }
          break;
        case 3:
          // 処理
          if(bottom < y) {
            bottom = y;
          }
          break;
        case 4:
          // 処理
          if(top > y) {
            top = y;
          }
          break;
      }
    }
    if(left > right || bottom > top) {
      System.out.println(0);
    } else {
   	  System.out.println((right - left) * (top - bottom));
    }
  }
}