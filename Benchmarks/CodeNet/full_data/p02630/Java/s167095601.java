import java.util.*;


public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] a = new int[N]; 
    for (int i=0; i<N; i++){
      a[i] = scanner.nextInt();
    }
    int Q = scanner.nextInt();
    int[] b = new int[Q];
    int[] c = new int[Q];
    for(int i=0; i<Q; i++){
      b[i] = scanner.nextInt();
      c[i] = scanner.nextInt();
    }

    long sum = 0;
    for(int i =0; i< Q; i++){
      for(int j=0; j<N; j++){
        if(a[j] == b[i]){
          a[j] = c[i];
        }
        sum += a[j];
      }
      System.out.println(sum);
      sum = 0;
    }
    scanner.close();
    return;
  }
}
