import java.util.Scanner;

public class Main {
  static long n, x;

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    n = sc.nextLong();  x = sc.nextLong();

    long sum = 0;

    sum += x;
    sum += n - x;
    sum += x;

    if(n - 2 * x == 0){
      System.out.println(sum);
      return;
    }

    sum += x;
    if(n - 2 * x < x){
      sum += (x / (n - 2 * x) + 1) * (n - 2 * x);
    }
    else{
      sum += ((n - 2 * x) / x) * x;
    }

    System.out.println(sum);
  }
}