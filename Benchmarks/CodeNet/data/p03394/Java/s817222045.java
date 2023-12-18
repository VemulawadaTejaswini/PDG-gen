import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();

      int r = 0;
      while(r == 0){
        r = sub(N);
      }
    }

    public static int sub(int N){
      int[] nus = new int[N];
      int counter = 0;

      Random rnd = new Random();

      for (int f = 0; f < N;f++ ) {
        nus[f] = rnd.nextInt(30000);
      }

      int total = 0;

      for(int g = 0; g < N; g++){
        total += nus[g];
      }

      for (int i = 3; i < 30001; i++) {
        int hut = 0;
        int gut = 0;
        for(int n = 0; n < N; n++){
          if(nus[n] % i == 0){
            hut++;
          }

          int gcc = gcd(nus[n], total - nus[n]);
          if(gcc == 1){
            return 0;
          }
        }
        if(hut == N){
          return 0;
        }
      }

        for (int h = 0; h < N; h++) {
          if(h != N - 1){
            System.out.print(nus[h]  + " ");
          }else{
            System.out.println(nus[h]);
          }
        }
        return 1;
    }

    public static int gcd(int m, int n) {
          int r;
          while (n > 0) {
              r = m % n;
              m = n;
              n = r;
          }
          return m;
      }
}