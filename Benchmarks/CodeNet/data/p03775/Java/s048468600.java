import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int min = 100;
        for(long i = 1; i < n; i++) {
            if(n % i == 0) {
                long devider = n / i;
                int maxDisits = countMaxDisits(i, devider);
                if(maxDisits > min) break;
                min = Math.min(min, maxDisits);
            }
        }
        System.out.println(min);
    }

    static int countMaxDisits(long dev1, long dev2) {
        int count = 0;
        while(dev1 != 0 || dev2 != 0) {
            count++;
            dev1 /= 10;
            dev2 /= 10;
        }
        return count;
    }
}

