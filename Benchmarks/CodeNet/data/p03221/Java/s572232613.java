import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] P = new int[M+1];
    int[] Y = new int[M+1];
    int[] num = new int[M+1];
    int[] sum = new int[100001];
    int[] count = new int[10001];
    List<Integer> Ylist = new ArrayList<Integer>();
    for (int i =1; i<M+1; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      P[i] = a;
      Y[i] = a * 100000 + b;
      count[a]++;
      Ylist.add(a * 100000 + b);
    }
    Collections.sort(Ylist);
    for (int i =1; i<M+1; i++) {
      num[i] = Ylist.indexOf(Y[i]) + 1;
    }
    for (int i =1; i<M+1; i++) {
      for (int j =1; j<i; j++) {
        sum[i] += count[j];
      }
    }
    for (int i =1; i<M+1; i++) {
      num[i] = num[i] - sum[P[i]];
      System.out.println(String.format("%06d",P[i]) + String.format("%06d",num[i]));
    }
  } 
}