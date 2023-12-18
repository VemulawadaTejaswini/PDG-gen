import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long diff = Math.abs(a - b);
        if (diff % 2 == 0) {
            System.out.println(diff/2);
        } else {
            long min = Math.min(a-1, n-b) + 1 + (b-a-1)/2;
            System.out.println(min);
        }
    }
}