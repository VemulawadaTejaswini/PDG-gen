import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static int n, k;
    static ArrayList<Integer> d;
    static ArrayList<Integer> s;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        d = new ArrayList<>();
        for (int i = 0; i < k; i++) d.add(sc.nextInt());
        s = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if(!d.contains(i)) s.add(i);
        }
        System.out.println(dfs(0, 1));
        sc.close();
    }
    private static int dfs(int cur, int kurai) {
        int ret = Integer.MAX_VALUE;
        if(kurai == 100000) return ret;
        for(int a: s){
            int num = cur + a * kurai;
            if(num < n) num = dfs(num, kurai * 10);
            ret = Math.min(ret, num);
        }
        return ret;
    }

}
