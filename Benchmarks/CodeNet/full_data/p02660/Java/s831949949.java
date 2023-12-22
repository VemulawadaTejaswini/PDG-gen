import java.util.*;

public class Main {

    public static int solve(int n, HashSet<Integer> list) {

        Iterator iter = list.iterator();
        int result = 0;
        int power = 1;
        int base = 1;
        while(n > 1) {

            if(power == 1) {
                base = (int)iter.next();
            }
            double z = Math.pow(base, power);
            if(n % z == 0) {
                power++;
                n = n / (int)z;
                result++;
            } else {
                power = 1;
            }
        }
        return result;
    }

    public static void primeFactors(int n, HashSet<Integer> list) {
        while (n % 2 == 0) {
            list.add(2);
            n /= 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                list.add(i);
                n /= i;
            }
        }
        if (n > 2)
            list.add(n);
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        HashSet<Integer> list = new HashSet<>();

        int n = sn.nextInt();

        primeFactors(n, list);
        System.out.println(solve(n, list));

    }
}