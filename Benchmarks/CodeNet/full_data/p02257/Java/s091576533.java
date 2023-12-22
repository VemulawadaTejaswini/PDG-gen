import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by akensho on 2015/11/23.
 */
public class Main {
    static int n;
    static int[] array;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        while ( read() ){
            solve();
        }
    }

    static boolean read(){
        if( !sc.hasNext() ) return false;
        n = sc.nextInt();
        array = new int[n];
        for (int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }
        return true;
    }

    static void solve(){
        int res = 0;
        boolean[] is_prime = eratosthenes(100000000);
        for (int value : array){
            if( is_prime[value] ) res++;
        }
        System.out.println(res);
    }

    static boolean[] eratosthenes(int n){
        if( n == 0 ) return new boolean[] {false};
        if( n == 1 ) return new boolean[] {false, false};
        boolean[] is_prime = new boolean[n+1];
        Arrays.fill(is_prime, true);
        is_prime[0] = false;
        is_prime[1] = false;
        for(int i = 2; i < is_prime.length; i++){
            if( is_prime[i]) {
                for (int j = i * 2; j < is_prime.length; j += i) {
                    is_prime[j] = false;
                }
            }
        }
        return is_prime;
    }
}