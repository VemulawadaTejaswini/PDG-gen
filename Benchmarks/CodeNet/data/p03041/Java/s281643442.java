import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    int k = stdIn.nextInt();
    String s = stdIn.next();

    s = s.substring(0,k-1) + (s.substring(k-1,k)).toLowerCase() + s.substring(k,n);

    System.out.println(s);
  }
}