import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] A = new int[N];

    double invalid = 0d;
    for(int i = 0; i < N; i++) {
      invalid += 1d / sc.nextInt();
    }

    double ans = 1d / invalid;


    System.out.println(ans);
  }
}
