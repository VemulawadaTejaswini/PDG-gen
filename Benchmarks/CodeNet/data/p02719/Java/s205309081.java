import java.math.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        while (true) {
            long tmp = 0;
            if(n>k)
            tmp = Math.abs(n % k);
            else
            tmp = Math.abs(n - k);
            if (tmp < n) {
                n = tmp;
            } else {
                break;
            }
        }
        System.out.println(n);
        }
    }