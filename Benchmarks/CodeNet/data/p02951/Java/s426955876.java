import java.util.*;

class Main {
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();

    System.out.println(transferTask(a, b, c));
  }

  private static int transferTask(int a, int b, int c) {
    int result = c - (a - b);
    if(result < 0) {
      return 0;
    }
    return c - (a - b);
  }
}