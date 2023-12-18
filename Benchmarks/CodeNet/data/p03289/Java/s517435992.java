import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String B = scan.next();
        char[] d = B.toCharArray();
        boolean answer = true;
        int count_upper = 0;
        int count_c = 0;
        int count_c_range = 0;
        for (int i = 0; i < d.length; i++) {
            if (d[i] == 'C') {
                count_c += 1;
            }
            if (i == 0) {
                if (d[i] != 'A') {
                    answer = false;
                    break;
                }
            }
            if (2 <= i && i <= d.length - 2) {
                if (d[i] == 'C') {
                    count_c_range += 1;
                }
            }
            if (0 <= d[i] - 'A' && d[i] - 'A' <= 25) {
                count_upper += 1;
            }
        }
        if (count_c_range != 1 || count_c_range != count_c) {
            answer = false;
        }
        if (count_upper != 2) {
            answer = false;
        }
        System.out.println(answer ? "AC" : "WA");
    }
}
