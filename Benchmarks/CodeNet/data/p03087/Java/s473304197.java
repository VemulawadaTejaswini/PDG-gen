import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //nという変数を作り、標準入力から数字を一つ読み取って、nに入れる
        int q = sc.nextInt();

        String s = sc.next();

        int[] l = new int[q];
        int[] r = new int[q];
        int[] t = new int[n];

        for (int i = 0; i < q; i++) {
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            t[i + 1] = s.substring(i, i+2).equals("AC") ? t[i] + 1 : t[i];
        }

        for (int i = 0; i < q; i++) {
            int res = t[r[i] - 1] - t[l[i] - 1];

            System.out.println(res);
        }
    }
}
