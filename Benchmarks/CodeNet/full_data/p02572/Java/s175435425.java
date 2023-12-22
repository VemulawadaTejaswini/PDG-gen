import java.util.Scanner;

public class Main {
      private static long MOD = (long) (1e9+7);

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            long ans = 0;
            long[] a = new long[N];
            for (int i = 0 ;i <N; i++){
                  a[i] = sc.nextLong() % MOD;
            }
            for (int i = 0;i<N-1;i++){
                  for(int j = i+1;j<N;j++){
                        ans = modPlus(ans,modTimes(a[i],a[j]));
                  }
            }
            System.out.println(ans);




      }
      public static long modPlus(long a ,long b){
            return (a + b) % MOD;
      }
      public static long modTimes(long a ,long b){
            return (a * b) % MOD;
      }


}
