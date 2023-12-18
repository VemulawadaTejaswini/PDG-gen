import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int l = sc.nextInt();
    int r = sc.nextInt();

    if (r > l + 2018) {
      System.out.println(0);
      System.exit(0);
    }

    int lowest = Math.min(l % 2019, (l + 1) % 2019);
    int lowest2 = Math.max(l % 2019, (l + 1) % 2019);;

    for (int i = l + 2; i <= l + 2018; ++i) {
        if (i % 2019 <= lowest) {
          lowest2 = lowest;
          lowest = i % 2019;
        } else if (i % 2019 <= lowest2) {
          lowest2 = i % 2019;
        }
    }
    
    System.out.println((lowest * lowest2) % 2019);

  }
}