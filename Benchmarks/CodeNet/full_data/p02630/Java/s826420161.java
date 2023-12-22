import java.util.*;


public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] p = new int[100001];
    int[] a = new int[N]; 
    long sum = 0;
    for (int i=0; i<N; i++){
      a[i] = scanner.nextInt();
      p[a[i]] += 1;
      sum += a[i];
    }
    int Q = scanner.nextInt();
    int[] b = new int[Q];
    int[] c = new int[Q];
    for(int i=0; i<Q; i++){
      b[i] = scanner.nextInt();
      c[i] = scanner.nextInt();
   
      sum = sum - b[i]*p[b[i]] + c[i]*p[b[i]];
      p[c[i]] += p[b[i]];
      p[b[i]] = 0;
      System.out.println(sum);
    }
    scanner.close();
    return;
  }
}
