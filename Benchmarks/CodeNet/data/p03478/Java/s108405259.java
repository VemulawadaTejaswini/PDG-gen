import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());

    int sum = 0;
    int sumAll = 0;
    for (int i = 1; i <= n; i++) {
      int i1 = i % 10;
      int i10 = (i/10)%10;
      int i100 = (i/100)%10;
      int i1000 = (i/1000)%10;
      int i10000 = (i/10000)%10;
      sum = i1 + i10 + i100 + i1000 + i10000;
      if (a <= sum && sum <= b) {
        sumAll += i;
      }
    }

    System.out.println(sumAll);
  }
}
