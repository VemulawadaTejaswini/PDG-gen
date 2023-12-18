import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String str = sc.next();
    int min;
    int numE = 0;
    for (int i=0; i<n; i++) {
      if (str.charAt(i) == 'E') {
        numE++;
      }
    }
    min = numE;

    for (int i=0; i<n; i++) {
      if (str.charAt(i) == 'E' && i<n-1) {
        numE--;
      }
      if (i>0 && str.charAt(i-1) == 'W') {
        numE++;
      }
      if (numE < min) {
        min = numE;
      }
    }
    System.out.println(min);
  }
}
