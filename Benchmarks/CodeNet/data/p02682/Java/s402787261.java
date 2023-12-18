import java.util.*;

class Main {
    private static Scanner sc;

    public static void main(final String[] args) {
        sc = new Scanner(System.in);
        long a = sc.nextLong(),b = sc.nextLong(),c = sc.nextLong(),k = sc.nextLong(),ans;
        if(k <= a) ans = k;
        else if(k > a && k-a <= b) ans = a;
        else ans = a - (k-a-b);
        System.out.println(ans);
    }
}






