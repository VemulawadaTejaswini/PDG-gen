import java.util.Scanner;


class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    while(true) {
      int m = sc.nextInt();
      int f = sc.nextInt();
      int r = sc.nextInt();

      if(m == -1 && f == -1 && r == -1) {
        break;
      }

      if(m == -1 || f == -1) {
        System.out.println("F");
      } else {
        int s = m + f;
        if(80 <= s) {
          System.out.println("A");
        } else if(65 <= s) {
          System.out.println("B");
        } else if(50 <= s) {
          System.out.println("C");
        } else if(30 <= s) {
          if(50 <= r) {
            System.out.println("C");
          } else {
            System.out.println("D");
          }
        } else {
          System.out.println("F");
        }
      }
    }
  }
}