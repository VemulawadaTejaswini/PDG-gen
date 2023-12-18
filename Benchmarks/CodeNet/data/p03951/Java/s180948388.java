import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        String s = sc.next();
        String t = sc.next();
        int max = 0;
        for (int i = 0; i < n; i++) {
            int tmp = 1;
            int itr = 1;
            if (s.charAt(i) == t.charAt(0)) {
                for (int j = i + 1; j < n; j++) {
                    if (s.charAt(j) == t.charAt(itr)) {
                        tmp++;
                    } else {
                        break;
                    }
                    itr++;
                }
                if (tmp > max) max = tmp;
            }
        }
        System.out.println(n * 2 - max);
    }

}
