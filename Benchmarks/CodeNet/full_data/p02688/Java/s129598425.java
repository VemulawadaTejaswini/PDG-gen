import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        Boolean[] s = new Boolean[n];
        Arrays.fill(s, false);
        for (int i = 0; i < k; i++) {
            int d = Integer.parseInt(sc.next());
            for (int j = 0; j < d; j++) {
                int a = Integer.parseInt(sc.next()) - 1;
                s[a] = true;
            }
        }
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (!s[i]) {
                c++;
            }
        }
        System.out.println(c);
    }
}