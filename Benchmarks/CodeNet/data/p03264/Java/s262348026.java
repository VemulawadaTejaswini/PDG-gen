import java.util.*;

public class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println(k%2==1?k/2*(k/2+1):k*k/4);
    }
}
