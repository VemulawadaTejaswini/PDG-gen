import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    double[] v = new double[N];
    for (int i = 0; i < N; i++) {
      v[i] = sc.nextDouble();
    }
    Arrays.sort(v);

    double sum = 0;
    for (int i = 0; i < N; i++) {
      if(i<2){
        sum += v[i];
      }else{
        sum += v[i]* (1 << (i-1));
      }
    }



    System.out.println((double)sum/(1<<(N-1)));


  }

}
