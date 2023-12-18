import java.util.Scanner;

public class Main {  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] a = new int[N];
    int[] count = new int[100001];
    int amax =0, amin =10000;
    for (int i =0; i<N; i++) {
      a[i] = sc.nextInt();
      amax = Math.max(a[i],amax);
      amin = Math.min(a[i],amin);
    }
    for (int i =amin; i<=amax; i++) {
      for (int j =0; j<N; j++) {
        if (a[j] >= i-1 & a[j] <= i+1) {
          count[i]++;
        }
      }
    }
    int max =0;
    for (int i =amin; i<=amax; i++) {
      max = Math.max(count[i],max);
    }
    System.out.println(max);  
  }
}