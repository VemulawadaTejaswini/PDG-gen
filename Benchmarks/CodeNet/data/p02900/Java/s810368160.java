import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        List<Integer> divisors = new ArrayList<>();

        for(int k = 1; k <= Math.sqrt(Math.min(A,B)); k++) {
            if(A % k == 0 && B % k == 0) {
                boolean fits = true;
                for(int d: divisors) {
                    if(d != 1 && k % d == 0) {
                        fits = false;
                    }
                }
                if(fits) {
                    divisors.add(k);
                }
            }
        }

        System.out.println(divisors.size());
    }
}
