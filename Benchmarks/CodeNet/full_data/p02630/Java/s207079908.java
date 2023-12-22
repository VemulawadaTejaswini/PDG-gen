import java.util.Scanner;

public class Main { 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] num = new int[100001];
    long total =0;
    for (int i =0; i<N; i++) {
      int a = sc.nextInt();
      total += a;
      num[a]++;
    }
    int Q = sc.nextInt();
    int[] B = new int[Q];
    int[] C = new int[Q];
    for (int i =0; i<Q; i++) {
      B[i] = sc.nextInt();
      C[i] = sc.nextInt();
    }
    for (int i =0; i<Q; i++) {
      total += (long)(C[i] - B[i]) * num[B[i]]; 
      num[C[i]] += num[B[i]];
      num[B[i]] =0;
      System.out.println(total);
    }
  }
}    