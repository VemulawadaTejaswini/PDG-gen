import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    static int a = sc.nextInt();
    static int b = sc.nextInt();
    static int c = sc.nextInt();
    static int[] l = new int[n];
    static int min = 100000000;
    public static void main(String[] args) {
        for (int i = 0 ; i < n ; i++) {
            l[i] = sc.nextInt();
        }
        List<Integer> list = new ArrayList<>();
        dfs(list);
        System.out.println(min);
    }

    static void dfs(List<Integer> list) {
        if (list.size() == n) {
            int sum = 0;
            int ac = 0; int bc = 0; int cc = 0;
            int as = 0; int bs = 0; int cs = 0;
            for (int i = 0 ; i < n ; i++) {
                if (list.get(i) == 0) {
                    ac++;
                    as += l[i];
                }
                if (list.get(i) == 1) {
                    bc++;
                    bs += l[i];
                }
                if (list.get(i) == 2) {
                    cc++;
                    cs += l[i];
                }
            }
            if (ac >= 1 && bc >= 1 && cc >= 1) {
                sum += 10 * (ac - 1);
                sum += 10 * (bc - 1);
                sum += 10 * (cc - 1);
                sum += Math.abs(as - a);
                sum += Math.abs(bs - b);
                sum += Math.abs(cs - c);
                min = Math.min(sum, min);
            }
            return;
        }
        for (int i = 0 ; i < 4 ; i++) {
            list.add(i);
            dfs(list);
            list.remove(list.size() - 1);
        }
    }

}