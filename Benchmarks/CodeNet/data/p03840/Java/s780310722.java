
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by sonetsuyoshi on 2016/07/31.
 */
public class Main {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a1 = sc.nextLong();
        long a2 = sc.nextLong();
        long a3 = sc.nextLong();
        long a4 = sc.nextLong();
        long a5 = sc.nextLong();
        long a6 = sc.nextLong();
        long a7 = sc.nextLong();

        long length = a2;

        long l = Math.min(a4, a5);
        a4 -= l;
        a5 -= l;
        length += l * 2;

        long a = a4 / 2;
        l = Math.min(a, a1);
        length += l * 3;
        a1 -= l;

        a = a5 / 2;
        l = Math.min(a, a5);
        length += l * 3;
        a1 -= l;

        a = a1 / 2;
        length += a * 2;
        System.out.println(length);
    }
}