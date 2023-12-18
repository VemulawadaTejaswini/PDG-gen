import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] params = in.nextLine().split(" ");
        long a = Long.parseLong( params[0]);
        long b = Long.parseLong( params[1]);

        long count = a < b ? a : b;
        for( long i = count ; 0 < i ; i-- ){
            // 公約数か確認
            if( a % i == 0 && b % i == 0 ){

                List<Long> primes = new ArrayList<>();
                long temp = 1;
                primes.add(temp);

                for( long j = 2 ; j <= i ;){
                    if( i % j == 0 ){
                        if( primes.get(primes.size()-1) != j ){
                            primes.add( j );
                        }
                        i /= j;
                    }
                    else {
                        j++;
                    }
                }

                System.out.println( primes.size() );
                return;
            }
        }
        System.out.println( 1 );

    }

}
