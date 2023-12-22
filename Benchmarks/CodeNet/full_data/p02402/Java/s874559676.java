import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int min = 1000000;
    int max = -1000000;
    long sum = 0;

    for (int i = 0; i < n; i++) {

      int tmp = scan.nextInt();
      min = Math.min(min, tmp);
      max = Math.max(max, tmp);
      sum += tmp;

    }
    
    System.out.println(min + " " + max + " " + sum);

  }
}
