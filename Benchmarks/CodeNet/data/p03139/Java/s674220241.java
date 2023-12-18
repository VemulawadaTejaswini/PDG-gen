import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    int A = Integer.parseInt(sc.next());
    int B = Integer.parseInt(sc.next());

    int max = Math.min(A, B);
    int min = Math.max(A + B - N, 0);
    System.out.println(max + " " + min);

  }
}