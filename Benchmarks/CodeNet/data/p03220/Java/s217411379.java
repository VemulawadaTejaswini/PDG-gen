import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int T = sc.nextInt();
    int A = sc.nextInt();
    int[] H = new int[N];
    double[] temp = new int[N];

    for (int i = 0; i<N; i++){
      H[i] = sc.nextInt();
      temp[i] = T - H[i] * 0.006 - A;
    }
    int min_index = 0;
    int tmp = temp[0];
    for (int i = 0; i<N; i++){
      if (tmp < temp[i]) {
        tmp = temp[i];
        min_index = i;
      }
    }
    System.out.println(min_index);

  }
}
