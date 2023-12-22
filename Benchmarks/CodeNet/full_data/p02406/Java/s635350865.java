import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int phase = 1;
    int i = 1;
    int x = 0;
    while (phase != 0) {
      switch (phase) {
      case 1:
        x = i;
        if ( x % 3 == 0 ){
          System.out.printf(" %d", i);
          phase = 3;
          continue;
        }
      case 2:
        if ( x % 10 == 3 ){
          System.out.printf(" %d", i);
          phase = 3;
          continue;
        }
        x /= 10;
        if (x != 0) {phase = 2;continue;}
      case 3:
        if ( ++i <= n ) {phase = 1;continue;}
      }
      System.out.printf("\n");
      phase = 0;
    }
  }
}

