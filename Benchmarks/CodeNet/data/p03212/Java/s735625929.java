import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int[] nums = { 3, 5, 7 };

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        System.out.println(dfs(n, list));
    }

    static int dfs(int n, List<Integer> list) {
        int ret = 0;
        if (list.size() > 0) {
            //nを超えている場合は探索しない
            if (convertListToNumber(list) > n) {
                return ret;
            } else {
                boolean flg = true;
                for (int x : nums) {
                    if (!list.contains(x))
                        flg = false;
                }
                if (flg)
                    ret++;
            }
        }
        //数字加えるパート
        for (int x : nums) {
            list.add(x);
            ret += dfs(n, list);
            list.remove(list.size() - 1);
        }
        return ret;
    }

    static int convertListToNumber(List<Integer> list) {
        int num = 0;
        for (int i = 0; i < list.size(); i++) {
            num += list.get(i) * Math.pow(10, list.size() - 1 - i);
        }
        return num;
    }

}