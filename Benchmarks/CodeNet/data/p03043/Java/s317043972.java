import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt();

    float[] list = new float[n];
    for (int i = 1; i <= n; i++) {

      int coin = i;
      int sum = 0;
      int p = 1;
      for (int j = 0; coin <= k; j++) {
        sum = coin * 2;
        coin = sum;
        p = p * 2;
      }

      list[i-1] = (float)1 / (n * p);
    }
    
    float result = 0;
    for (int i = 0; i < list.length; i++) {
      result += list[i];
    }

    System.out.println(result);
  }
}
