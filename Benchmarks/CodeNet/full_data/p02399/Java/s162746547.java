import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a / b);
        System.out.println(a % b);

        double ad = (double) a;
        double bd = (double) b;
        double ans = ad / bd;
        System.out.printf("%.5f", ans);
    }
}

