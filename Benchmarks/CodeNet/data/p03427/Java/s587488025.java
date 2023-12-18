import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] n = scan.next().toCharArray();
        for (int i = 0; i < n.length; i++) {
            n[i] -= '0';
        }
        int max = 0;
        for (int j = 0; j < n.length; j++) {
            max += n[j];
        }
        for (int i = n.length - 2; i >= 0 ; i--) {
            n[i + 1] = 9;
            if(n[i] == 0) {
                continue;
            }
            n[i]--;
            int sum = 0;
            for (char aN : n) {
                sum += aN;
            }
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}
