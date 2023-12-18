import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] S = sc.next().toCharArray();
        char[] T = sc.next().toCharArray();

        Arrays.sort(S);
        Arrays.sort(T);

        boolean flag = true;
        char tmp1 = S[0];
        char tmp2 = T[0];
        for (int i = 1; i < S.length; i++) {
            if (tmp1 == S[i] && tmp2 == T[i] || tmp1 != S[i] && tmp2 != T[i]) {
                tmp1 = S[i];
                tmp2 = T[i];
            } else {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}