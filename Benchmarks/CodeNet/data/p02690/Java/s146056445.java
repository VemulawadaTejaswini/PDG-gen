import java.util.*;
public class Main
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        ArrayList<Long> factors = new ArrayList<>();
        factors.add((long)1);
        for (long i = 2; i <= 130; i++) {
            if (x % Math.abs(i) == 0) factors.add(i);
        }
        long a = -1; long b = -1;
        for (Long dif: factors) {
            for (long lo = -130; lo + dif < 131; lo++) {
                if (Math.pow(lo + dif, 5) - Math.pow(lo, 5) == x) {
                    a = lo + dif; b = lo;
                }
            }

        }
        System.out.println(a + " " + b);
    }


}