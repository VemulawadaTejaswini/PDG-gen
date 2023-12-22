import java.util.Scanner;

class Main {
  public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);

      int S = scanner.nextInt();
      int h ;
      int m ;
      int s ;
      h = S/3600;
      m = ((S%3600) / 60);
      s = S % 60;
      System.out.println(h + ":" + m + ":" + s);
      scanner.close();
  }
}
