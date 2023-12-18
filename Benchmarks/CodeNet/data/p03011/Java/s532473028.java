import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int L = sc. nextInt();
    int[] ans= new int[3];

    ans[0] = N + M;
    ans[1] = M + L;
    ans[2] = L + N;

    int min = 999999999;
    for(int i = 0; i < 3; i++) {
    	min = Math.min(min, ans[i]);
    }
    System.out.println(min);
  }
}
