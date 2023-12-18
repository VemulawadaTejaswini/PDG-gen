import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        if (a % 2 == 0 && b % 2 == 0 && c % 2 == 0) {
            System.out.println(0);
        } else {
            if (a*b*1 <= b*c*1) {
                if (a*b*1 <= c*a*1) {
                    System.out.println(a*b*1);
                }
            } else if (b*c*1 <= c*a*1) {
                if (b*c*1 <= a*b*1) {
                    System.out.println(b*c*1);
                }
            } else if (c*a*1 <= a*b*1) {
                if (c*a*1 <= b*c*1) {
                    System.out.println(c*a*1);
                }
            }
        }
    }

}
