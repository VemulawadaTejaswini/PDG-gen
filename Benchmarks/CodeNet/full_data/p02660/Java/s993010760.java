import java.util.*;

public class Main{

    private static long max;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        if(isPrime(n)){
            System.out.println(1);
            return;
        }

        List<Long> div = divisor(n);
        div.remove(0);

        long count = 0;

        next:
        while(true){
            for(Long z : div){
                if(n % z == 0){
                    div.remove(z);
                    n = n / z;
                    count++;
                    continue next;
                }
            }
            break ;
        }

        System.out.println(count);
    }

    static List<Long> divisor(long n){
        List<Long> result = new ArrayList<>();
        List<Long> reverse = new ArrayList<>();
        long i = 0;
        long sqrt = (long)Math.ceil(Math.sqrt(n));
        while(++i < sqrt){
            if(n % i == 0){
                result.add(i);
                reverse.add(n / i);
            }
        }
        if(i * i == n){
            result.add(i);
        }
        Collections.reverse(reverse);
        result.addAll(reverse);
        return result;
    }

    static boolean isPrime(long n){
        if(n == 2){
            return true;
        }
        if(n < 2 || n % 2 == 0){
            return false;
        }
        long sqrt = (long)Math.sqrt(n);
        for(long i = 3; i <= sqrt; i += 2){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }


}
