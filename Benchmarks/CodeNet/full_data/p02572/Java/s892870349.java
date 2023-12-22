import java.util.Scanner;

public class Main {
      private static long MOD = (long) (1e9+7);

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            long ans = 0;
            long sum_1 = 0;
            long sum_2 = 0;
            for (int i = 0 ;i<N;i++){
                  long tmp = sc.nextLong();
                  sum_1 = modPlus(sum_1,tmp);
                  sum_2 = modPlus(sum_2,modTimes(tmp,tmp));
            }
            sum_1 = modTimes(sum_1,sum_1);
            ans = modMinus(sum_1,sum_2) / 2 ;
            System.out.println(ans);




      }
      public static long modPlus(long a ,long b){
            return (a + b) % MOD;
      }
      public static long modTimes(long a ,long b){
            return (a * b) % MOD;
      }
      public static long modMinus(long a , long b){
            long tmp = a - b;
            if(tmp<0){
                  return tmp + MOD;
            }
            else return tmp;
      }


}
