import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static char[] strs;
    static final char VISITED = 'v';

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == 0)
                break;
            strs = sc.next().toCharArray();
            for (int i = 0; i < n; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < strs.length; j++) {
                    if (strs[j] != VISITED) {
                        char tmp = strs[j];
                        sb.append(ope(strs[j], j) + "" + tmp);
                    }
                }
                strs = sb.toString().toCharArray();
            }
            System.out.println(strs);
        }
    }

    public static int ope(char c, int it) {
        int ct = 0;
        while (it < strs.length && strs[it] == c) {
            ct++;
            strs[it] = VISITED;
            it++;
        }
        return ct;
    }
}