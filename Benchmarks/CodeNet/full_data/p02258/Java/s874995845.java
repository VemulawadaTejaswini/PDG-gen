import java.util.Scanner;

public class Main {
    public static Scanner sc;
    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a = sc.nextLong();
        long b;
        long res = (long)(-1*Math.pow(10,9));
        long sum = 0;
        while (sc.hasNext()) {
            b = sc.nextLong();
            long diff = b-a;
            if (diff < 0) {
                if (res < diff) {
                    res = diff;
                }
                sum = 0;
            } else if (diff > 0) {
                sum += diff;
                if (res < sum) {
                    res = sum;
                }
            } else {
                if (res < diff) {
                    res = diff;
                }
            }
            a = b;
        }
        if (res == (long)(-1*Math.pow(10,9))) res = 0;
        System.out.println(res);
    }
}