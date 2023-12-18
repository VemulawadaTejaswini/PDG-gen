import java.util.*;
public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    double K = sc.nextDouble();

    sc.close();

    double answer = 0.0;

    for (int i = 1; i <= N; i++) {

      double count = i;
      double j = 0;

      while (count < K) {
        count = count * 2;
        j++;
      }

      answer += Math.pow(0.5,j) / N;

    }

    System.out.println(answer);
 
  }

}