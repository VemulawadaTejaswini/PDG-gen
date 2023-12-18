import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    long[] a = new long[N];
    long[] sum = new long[N*(N-1)/2];

    for (int i = 0; i < N; i++) {
      a[i] = sc.nextInt();
    }

    int cnt = 0;

    for (int i = 0; i < N-1 ; i++) {
      for(int j = i+1; j < N; j++) {
        sum[cnt] = a[i]*a[j];
        cnt++;
      }
    }

    Arrays.sort(sum);
    System.out.println(sum[K-1]);   
    return;
  }
}
