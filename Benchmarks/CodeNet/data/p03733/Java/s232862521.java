import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int t = sc.nextInt();
    int[] time = new int[n];
    long sum = 0;

    for (int i = 0; i < n; i++) {
      time[i] = sc.nextInt();
    }

    for (int i = 0; i < (n - 1); i++) {
      sum += Math.min(time[i + 1] - time[i], t);
    }

    sum += t;

    System.out.println(sum);

  }
}