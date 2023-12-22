import java.util.*;

import static java.lang.Math.floor;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int h = (int)floor(a/3600);
        int m = (int)floor(a%3600 /60);
        int s = a%60;
        System.out.print(h+":"+m+":"+s);
        System.out.println();
    }
}
