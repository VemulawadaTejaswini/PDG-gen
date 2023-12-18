import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    System.out.println(sovle(a, b));
  }

  private static long sovle(int a, int b) {
    int[] arr = new int[1000];
    int res = 0;
    for (int i = 1; i < 1000; i++) {
      arr[i] = arr[i - 1] + i;
    }
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] - a == arr[i + 1] -b){
        res = arr[i] - a;
        break;
      }
    }
    return res;
  }

}
