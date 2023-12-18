import java.util.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double ret;
        if (n % 2 == 0) {
            ret = 0.5d;
        } else {
            ret = (double) ((n + 1) / 2) / n;
        }
        sc.close();
        System.out.println(ret);
    }
}
