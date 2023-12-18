import java.util.*;


public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    double max = 0;
    int N = sc.nextInt();
    int K = sc.nextInt();
    double[] count = new double[N-K+1];
    double[] P = new double[N];

    for(int i = 0;i < N;i++){
      P[i] = sc.nextDouble();
    }

    for(int i = 0;i < N-K+1;i++){
      for(int j = i;j < i+K;j++){
        count[i] += (P[j]+1)*0.5;
      }
      if(count[i] > max){
        max = count[i];
      }
    }
    System.out.print(max);
  }
}