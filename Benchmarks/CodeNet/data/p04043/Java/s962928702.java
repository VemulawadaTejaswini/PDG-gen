import java.util.Scanner;

class Main {
  static int count5 = 0;
  static int count7 = 0;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    func(sc.nextInt());
    func(sc.nextInt());
    func(sc.nextInt());
    if (count5 == 2 && count7 == 1) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
    sc.close();
  }
  static void func(int target){
    if (target == 5) {
      count5++;
    } else if (target == 7) {
      count7++;
    }
  }
}