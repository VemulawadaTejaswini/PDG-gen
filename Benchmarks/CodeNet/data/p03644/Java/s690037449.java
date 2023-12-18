import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    sc.close();

    int sum = 0;
    int count = 0;

    while (sum <= N) {
      count++;
      sum = (int) Math.pow(2, count);
    }

    System.out.println((int) Math.pow(2, count - 1));

  }

}