import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        long n = sc.nextLong()-2;
        int k = sc.nextInt();
        long ret = (n/11)*5;
        long r = n%11;
        for (int i = 1;i <= r;i++) {
            for (int j = 1;j <= 5;j++) {
                if (calc(i,j,k)) ret++;
            }
        }
        System.out.println(ret);
    }
    private static boolean calc(int x, int y, int k) {
        return ((63*x+9*y+9)%11)==k;
    }
}
