import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    while(true) {
      String target = sc.next();

      if(target.equals("-")) {
        break;
      }

      int m = sc.nextInt();
      for(int i = 0; i < m; i++) {
        int position = sc.nextInt();
        target = target.substring(position, target.length()) + target.substring(0, position);
      }

      System.out.println(target);
    }
  }
}