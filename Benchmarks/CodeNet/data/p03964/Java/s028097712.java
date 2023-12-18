import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arrT = new int[n];
    int[] arrA = new int[n];
    for (int i = 0; i < n; i++) {
      arrT[i] = sc.nextInt();
      arrA[i] = sc.nextInt();
    }
    sc.close();

    long t = arrT[0];
    long a = arrA[0];
    for (int i = 1; i < n; i++) {
      long mltT = t / arrT[i] + 1;
      long mltA = a / arrA[i] + 1;
      long mlt = mltT >= mltA ? mltT : mltA;
      t = arrT[i] * mlt;
      a = arrA[i] * mlt;
    }
    System.out.println(t + a);
  }
}
