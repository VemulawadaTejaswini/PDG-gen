import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int Y = sc.nextInt();
    
    for (int i = 0; i <= N; i++) {
      if (i * 10000 > Y) break;
      for (int j = 0; j <= N - i; j++) {
        if (i * 10000 + j * 5000 > Y) break;
        if ((Y - i * 10000 + j * 5000) / 1000 <= N - i - j) {
          System.out.println(i + " " + j + " " + ((Y - i * 10000 + j * 5000) / 1000));
          return; 
        }
      }
    }
    System.out.println("-1 -1 -1");
  }
}
  