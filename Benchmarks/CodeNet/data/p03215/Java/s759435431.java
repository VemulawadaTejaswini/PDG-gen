import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws Exception{
    try (Scanner sc = new Scanner(System.in)){
      int N = sc.nextInt();
      int K = sc.nextInt();
      long[] a = new long[N];
      long[] arr = new long[N*(N+1)/2];
      for (int i = 0; i < N; i++) {
        a[i] = sc.nextLong();
        for (int j = i; j < N; j++) {
          arr[j] += a[i];
        }
      }
      int index = N;
      int preindex = 0;
      for (int i = 1; i < N; i++) {
        arr[index] = a[i];
        for (int j = 1; j < N-i; j++) {
          arr[index+j] = arr[index] + arr[preindex + j-1];
        }
        preindex = index;
        index += N-i;
      }
      //System.out.println(Arrays.toString(arr));

      Arrays.sort(arr);
      int MAXN = N*(N+1)/2;
      long ret = arr[MAXN-1];
      for (int i = 1; i < K; i++) {
        ret = ret & arr[MAXN-1-i];
      }
      System.out.println(ret);
    }
  }
}
