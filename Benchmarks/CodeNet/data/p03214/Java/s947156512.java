import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] a = new int[N];
    for(int i=0; i<N; i++){
      a[i] = sc.nextInt();
    }
    int sum = 0;
    for(int i=0; i<N; i++){
      sum += a[i];
    }
    
    int ans = 0;
    int avg = sum/N;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < N; i++) {
      if (min > Math.abs(a[i] - avg)) {
        ans = i;
        min = Math.abs(a[i] - avg);
      }
    }
    System.out.println(ans);
  }
}