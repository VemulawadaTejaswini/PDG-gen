import java.util.Scanner;
class AirConditioner {
  public static void main (String args[]) {
    Scanner sc= new Scanner(System.in);
    System.out.println("現在の温度(整数)を入力してください");
    int X = sc.nextInt();
    if (X <= 40 && X >= -40) {
      if (X>=30) {
        System.out.println("yes");
      } else {
        System.out.println("no");
      }
    } else {
      System.out.println("-40以上40以下の整数を入力してください");
    }
  }
}
