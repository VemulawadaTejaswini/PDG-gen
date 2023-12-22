import java.util.Arrays;
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      
      int N = sc.nextInt();
	  int[] X = new int[N];
      int[] Y = new int[N];
      
      int D = sc.nextInt();
      
      double res1 = Math.pow(X[N], 2);
      double res2 = Math.pow(Y[N], 2);
      double dis = Math.sqrt(res1 + res2);
      int cnt = 0;
      
      for(int i=0; i<=N; i++) {
        if(dis <= D) {
          cnt ++;
        } else {
          continue;
        }
      }
      System.out.println(cnt);
    }
}