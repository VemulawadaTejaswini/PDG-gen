/*
 * Click `Run` to execute the snippet below!
 */

import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(), K = sc.nextInt();
    int arr[] = new int[N];
    for(int i = 0; i<N; i++){
      arr[i] = sc.nextInt(); 
    }
    Arrays.sort(arr);
    long sum = 0;
    for(int i = 0; i<N-K; i++){
      sum += arr[i]; 
    }
    System.out.println(sum);
  }
}
