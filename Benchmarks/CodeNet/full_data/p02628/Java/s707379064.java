import java.util.Scanner;
import java.util.Arrays;

public class Main{
	public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
      int N = scan.nextInt();
      int K = scan.nextInt();
      int p[] = new int[N];

      for(int i = 0;i < N;i++){
          p[i] = scan.nextInt();
      }
      Arrays.sort(p);

      int ans = 0;
      for(int i = 0;i < K;i++){
          ans += p[i];
      }
      System.out.println(ans);
    }
}