import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String O = scan.next();
        char[] o_data = O.toCharArray();
        String E = scan.next();
        char[] e_data = E.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Math.max(O.length(), E.length()); i++) {
            if (i < O.length()) {
                sb.append(o_data[i]);
            }
            if (i < E.length()) {
                sb.append(e_data[i]);
            }
        }
        System.out.println(sb.toString());
    }
}
