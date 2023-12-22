import java.util.Scanner;
import java.util.Arrays;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = 10, m = 3;
    int alt[] = new int[n];
    for (int i = 0; i < n; i++) {
      alt[i] = sc.nextInt();
    }
    Arrays.sort(alt);
    for (int i = 0; i < m; i++) {
      System.out.println(alt[n-i-1]);
    }
  }
}