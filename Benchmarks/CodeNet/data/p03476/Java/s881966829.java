import java.util.*;

class Main {
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int     n    = Integer.parseInt(scan.next());

      final int MAX = 100000 + 1;

      boolean[] primes = new boolean[MAX];

      primes[2] = true;

      for(int i = 3; i < MAX; i += 2){
          primes[i] = true;
          }

      for(int i = 3; i * i < MAX; i += 2){
          if(primes[i]){
             for(int j = i * 2; j < MAX; j += i){
                 primes[j] = false;
                 }
             }
          }

      for(int i = 0; i < n; i++){
          int a   = Integer.parseInt(scan.next());
          int b   = Integer.parseInt(scan.next());
          int cou = 0;
          for(int j = a; j < b + 1; j++){
              if(primes[j] == true){
                 if(primes[(j + 1) / 2] == true){
                    cou++;
                    }
                 }
              }
          System.out.println(cou);
          }
   }
}
