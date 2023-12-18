import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        long n = sc.nextLong();
        long m = sc.nextLong();
        long ret = 0;
        if (n==m/2) {
            ret = n;
        } else if (n>m/2) {
            ret = m/2;
        } else {
            ret = n+(m-n*2)/4;
        }
        System.out.println(ret);
    }
}
