import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] A = new int[n];
    for(int i=0;i<n;i++){
      A[i] = sc.nextInt();
    }
    
    //ここから
    int min;
    int pos;
    for(int i=0;i<A.length-1;i++){
      min = A[i];
      pos = i;
      for(int j=i+1;i<A.length;j++){
        if( min > A[j] ){
          min = A[j];
          pos = j;
        }
      }
      A[pos] = A[i];
      A[i] = min;
    }
    
    int ans = 0;
    for(int i=0;i<k;i++){
      ans += A[i];
    }
  }
}