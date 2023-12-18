import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    long[] P = new long[M+1];
    int[] count = new int[100001];
    int[] count2 = new int[100001];
    for (int i =1; i<M+1; i++) {
      int a = sc.nextInt();
      count[a]++;
      P[i] = (long)a * 1000000 + sc.nextLong();
    }
    for (int i =1; i<100001; i++) {
      count2[i] += count[i-1];
    }
    long[] Psort = P.clone();
    Arrays.sort(Psort);
    for (int i =1; i<M+1; i++) {
      for (int j =1; j<M+1; j++) {
        if (P[i] == Psort[j]) {
          long a = P[i]/1000000;
          P[i] = P[i] /1000000 * 1000000 + j - count2[(int)a];
          System.out.println(String.format("%012d",P[i]));
        }
      }
    }
  }
}