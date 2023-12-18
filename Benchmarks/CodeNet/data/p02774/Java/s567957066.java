import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    ArrayList arr = new ArrayList();
    long a[] = new long[n];
//    long dp[][] = new long[][];
    for (int i=0; i<n; i++){
      a[i]=sc.nextInt();
    }
    for (int i=0; i<n-1; i++){
    for (int j=i+1; j<n; j++){
      arr.add(a[i] * a[j]);
    }}
    Collections.sort(arr);
    System.out.println(arr.get(k-1));

  }
  private static int chmax(int a, int b) {
    return Math.max(a,b);
  }
}


