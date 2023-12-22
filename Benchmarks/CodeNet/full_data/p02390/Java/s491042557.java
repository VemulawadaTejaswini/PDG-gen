import java.util.Scanner;
 
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int h, m, s;
    s = scan.nextInt();
 
    h = s / 3600;
    m = (s % 3600) / 60;
    s = s % 60;
    System.out.println(h + ":" + m + ":" + s);
  }
}
