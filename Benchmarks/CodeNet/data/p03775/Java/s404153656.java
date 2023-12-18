import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long min = 100;

        for (long i=1; i<(long) Math.sqrt(N)+1; i++) {
            if (N % i != 0) { 
                continue;
            }
            long m = i > (N / i) ? i : (N / i);
            long a = (long) Math.log10(m) + 1;
            min = min < a ? min : a;
        }

        System.out.println(min);
    }
}

