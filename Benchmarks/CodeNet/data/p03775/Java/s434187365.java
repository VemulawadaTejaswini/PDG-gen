import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main {
    public static int numDigits(long num){
        int res = 0;
        while(num != 0){
            num /= 10;
            res += 1;
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
//        boolean[] sieve = new boolean[100001];
//        Arrays.fill(sieve, true);
//        sieve[0] = false;
//        sieve[1] = false;
//        int index = 2;
//        while(index * index <= 100000){
//            if(sieve[index]){
//                for (int i = index * index; i <= 100000; i += index) {
//                    sieve[i] = false;
//                }
//            }
//            index += 1;
//        }
//        ArrayList<Integer> prime = new ArrayList<>();
//        for(int i = 2; i <= 100000; i++){
//            if(sieve[i])
//                prime.add(i);
//        }
        long bound = (int) Math.sqrt(n);
        int res = numDigits(n);
        for(long i = 2; i <= bound; i++){
            if(n % i == 0){
                res = Math.min(res, Math.max(numDigits(i), numDigits(n/i)));
            }
        }
        System.out.println(res);
        
    }
}
