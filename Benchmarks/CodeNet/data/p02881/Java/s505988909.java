import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
//        System.out.println(N);
        long p = N;
        List<Integer> primes = new ArrayList<Integer>();
//        long a = 0;
        long b = 0;
        long num = 0;
        long minNum = (long) Math.pow(10, 12);
        for (long a = 1; a <= Math.sqrt(N); a++){
            if (N % a != 0){
                continue;
            } else {
                b = N / a;
            }
            num = a + b - 2;
            if (num < minNum){
                minNum = num;
            }
        }
        System.out.println(minNum);



//        for (long i = Math.sqrt(N); i >= 1; i--){
//            while (p % i == 0){
//                p = p / i;
//                primes.add(i);
//            }
//        }
//        int a = 1; int b = 1;
//        for (int i = 0; i < primes.size(); i++){
//            if (a <= b) {
//                a *= primes.get(i);
//            } else {
//                b*=
//            }
//        }


    }
}
