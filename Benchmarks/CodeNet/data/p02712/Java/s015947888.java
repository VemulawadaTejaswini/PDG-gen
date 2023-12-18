import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) {
  	int n = in.nextInt();
    
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      if (i % 3 == 0 || i % 5 == 0)
        continue;
      sum += i;
    }
    
    System.out.println(sum);
  }
}