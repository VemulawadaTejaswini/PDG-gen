import java.util.Scanner;
class AirConditioner {
  public static void main (String args[]) {
    Scanner sc= new Scanner(System.in);
    int X = sc.nextInt();
    if (X <= 40 && X >= -40) {
      if (X>=30) {
        System.out.println("yes");
      } else {
        System.out.println("no");
      }
    }
  }
}