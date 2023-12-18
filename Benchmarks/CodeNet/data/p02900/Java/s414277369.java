
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();

        if (A > B) {
            long tmp = B;
            B = A;
            A = tmp;
        }

        List<Long> array = new ArrayList<>();
        List<Long> arrayResult = new ArrayList<>();

        for (long i = 1; i <= A; i++) {
            if ((A % i == 0) && (B % i == 0)) {
                array.add(i);
                arrayResult.add(i);
            }
        }

        for (int i = 1; i < arrayResult.size() - 1; i++) {
            for (int j = i + 1; j < arrayResult.size(); j++) {
                if (gcd(arrayResult.get(i), arrayResult.get(j)) != 1) {
                    arrayResult.remove(arrayResult.get(j));
                }
            }
        }
        System.out.println(arrayResult.size());
    }

    static long gcd(long x, long y) {
        return y > 0 ? gcd(y, x % y) : x;
    }
 
}