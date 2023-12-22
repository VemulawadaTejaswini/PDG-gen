import java.util.Arrays;
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      
      int N = sc.nextInt();
      int D = sc.nextInt();
	  int[] X = new int[N];
      int[] Y = new int[N];
      
      double res1 = Math.pow(X[N], 2);
      double res2 = Math.pow(Y[N], 2);
      double res12 = res1 + res2;
      double dis = Math.sqrt(res12);
      int cnt = 0;
      
      for(int i=0; i<=N; i++) {
        if(dis<=D) {
          cnt ++;
        }
      }
      System.out.println(cnt);
    }
}