import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        final int MAX = 999999;
        int number;
        double comp;
        boolean isPrime;
        LinkedHashSet<Integer> prime;
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()) {
            number = sc.nextInt();
            prime = new LinkedHashSet<>();
//        long start = System.currentTimeMillis();
            prime.add(2);
            for (int i = 3; i < number + 1; i += 2) {
                isPrime = true;
                for (int p : prime) {
                    comp = (double) i / (double) p;
                    if (p == 1) {
                        continue;
                    }
                    if (i % p == 0) { //iが見つかった素数で割り切れる
                        isPrime = false;
                        break;
                    } else if (p > comp) {
                        break;
                    }
                }
                if (isPrime) {
                    prime.add(i);
                }
            }
            System.out.println(prime.size());
        }
    }
}