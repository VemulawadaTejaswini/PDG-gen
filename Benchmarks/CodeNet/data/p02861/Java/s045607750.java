import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] x = new int[n];
    int[] y = new int[n];
    for(int i = 0; i < n ;i++){
      x[i] = sc.nextInt();
      y[i] = sc.nextInt();
    }
    double sum = 0d;
    int count = 0;
    for(int i = 0; i < n; i++){
      for(int j = i + 1; j < n ; j++){
        count ++;
        sum += calc(x[i], y[i], x[j], y[j]);
      }
    }
    System.out.println(sum / count *(n - 1));
  }

  public static double calc(int x1, int y1, int x2, int y2){
    return Math.sqrt( (x1 - x2) *  (x1 - x2) + (y1 - y2) * (y1 - y2));
  }
}
