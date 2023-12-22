import java.util.*;

public class Main{

    private static long max;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        List<Long> div = divisor(n);
        div.remove(0);
        //List<Integer> prime = primeNumbers(n);

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

    static List<Integer> primeNumbers(Integer n){
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        int sqrt = (int)Math.sqrt(n);
        for(int i = 2; i <= sqrt; i++){
            if(isPrime[i]){
                for(int j = i * 2; j <= n; j += i){
                    isPrime[j] = false;
                }
            }
        }
        List<Integer> result = new ArrayList<>();
        for(int i = 2; i <= n; i++){
            if(isPrime[i]){
                result.add(i);
            }
        }
        return result;
    }


}
