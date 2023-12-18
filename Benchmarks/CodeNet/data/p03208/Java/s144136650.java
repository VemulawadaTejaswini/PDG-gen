import java.util.*;
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int arr[] = new int[N];
    for(int i = 0; i<N; i++){
      arr[i] = sc.nextInt(); 
    }
    Arrays.sort(arr);
    int ans = 1000000000;
    for(int i = K-1; i<N; i++){
      ans = Math.min(ans, arr[i] - arr[i-K+1]); 
    }
    System.out.println(ans);
  }
}
