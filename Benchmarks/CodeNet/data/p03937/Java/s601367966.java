import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int h = sc.nextInt();
        int w = sc.nextInt();
        String[] a = new String[h];
        int black = 0;
        for (int i = 0; i < h; i++) {
            a[i] = sc.next();
            for (int j = 0; j < w; j++) {
                if (a[i].charAt(j) == '#') black++;
            }
        }
        if (black == h+w-1) {
            System.out.println("Possible");
        } else {
            System.out.println("Impossible");
        }
    }

}
