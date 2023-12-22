import java.util.*;


public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] p = new int[100001];
    int[] a = new int[N]; 
    for (int i=0; i<N; i++){
      a[i] = scanner.nextInt();
      p[a[i]] += 1;
    }
    int Q = scanner.nextInt();
    int[] b = new int[Q];
    int[] c = new int[Q];
    for(int i=0; i<Q; i++){
      b[i] = scanner.nextInt();
      c[i] = scanner.nextInt();
    }

    long sum = 0;
    // for(int j=0; j<N; j++){
    //   sum += a[j];
    // }    
    for(int i =0; i< Q; i++){
      // sum = sum - b[i]*p[b[i]] + c[i]*p[b[i]];
      
      p[c[i]] += p[b[i]];
      p[b[i]] = 0;
      for(int j=0; j<100001; j++){
        sum += j * p[j];
      }  
      System.out.println(sum);
      sum = 0;
    }
    scanner.close();
    return;
  }
}
