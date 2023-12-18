import java.util.*;

public class Main {

    public static int maxBArg(int[] b, boolean[] lost, int N) {
        int arg = 0;
        int max = 0;
        for (int i = 0; i < N; i++) {
            if (lost[i] == false && max < b[i]) {
                max = b[i];
                arg = i;
            }
        }
        return arg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int H = sc.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];
        int damage = 0;
        int count = 0;
        int needB = N;
        boolean[] lost = new boolean[N];
        //値の入力とaの最大値の発見
        int a_max = 0;
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            if (a_max < a[i]) {
                a_max = a[i];
            }
        }
        //aの最大値 > b となっているbは使わない
        for (int i = 0; i < N; i++) {
            if (b[i] < a_max) {
                lost[i] = true;
                needB--;
            }
        }
        //b攻撃のみで撃破できるか
        for (int i = 0; i < needB; i++) {
            int arg = maxBArg(b, lost, N);
            damage += b[arg];
            count++;
            if (damage >= H) {
                System.out.println(count);
                return;
            }
            lost[arg] = true;
        }
        int remain = H - damage;
        while (remain > 0) {
            remain -= a_max;
            count++;
        }
        System.out.println(count);
    }

}
