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
    int N = sc.nextInt();
    int arr[] = new int[N+2];
    arr[0] = 0;
    arr[N+1] = 0;
    for(int i = 1; i<=N; i++){
      arr[i] = sc.nextInt();
    }
    for(int i = 1; i<=N; i++){
      int ans = 0;
      for(int j = 1; j<=N+1; j++){
        if(j == i){
         //nothing happens  
        }
        else if(j == i+1){
         ans += Math.abs(arr[j] - arr[j-2]);
        }
        else{
          ans += Math.abs(arr[j] - arr[j-1]);
        }
      }
      System.out.println(ans);
    }
  }
}
