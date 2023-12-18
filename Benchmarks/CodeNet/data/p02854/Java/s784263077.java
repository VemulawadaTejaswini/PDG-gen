import java.util.Scanner;

public class Main {
  public static void main(String... args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    
    int[] A = new int[N];
    int sum = 0;
    for(int i=0; i<N; i++) {
      A[i] = scan.nextInt();
      sum += A[i];
    }
    int cut_point = sum/2;

    int tmp_sum = 0;
    int ans = 0;
    for(int val : A) {
      tmp_sum += val;
      if(tmp_sum >= cut_point) {
        ans = tmp_sum - cut_point;
        tmp_sum = 0;
      }
    }
    ans += tmp_sum != 0 ? cut_point - tmp_sum : 0 ;
    System.out.println(ans);
  }
}