

import java.io.BufferedInputStream;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * AOJ Ball 0033
 * ?????????1??°10??±10????????????????????¢???????????\??£????????\???????????\???????????????????????????10????????¨??¨?????????????????????????????§??????
 * ????°???°??§?????????????????????YES???????????????NO???
 *
 * @author ants_ypc
 * @version 1.0 5/5/16
 */
public class Main {
    private LinkedList<Integer> list1 = new LinkedList<Integer>();
    private LinkedList<Integer> list2 = new LinkedList<Integer>();

    public boolean isOk(int[] nums) {
        return dfs(nums, 0);
    }

    private boolean dfs(int[] nums, int i) {
        if (i >= 10) return true;
        Integer a= list1.peek();
        Integer b = list2.peek();
        if (a == null) {
            list1.offer(nums[i]);
            if (dfs(nums, i + 1)) return true;
            list1.poll();
        } else if (a < nums[i]){
            list1.offer(nums[i]);
            if (dfs(nums, i + 1)) return true;
            list1.poll();
        }
        if (b == null) {
            list2.offer(nums[i]);
            if (dfs(nums, i + 1)) return true;
            list2.poll();
        } else if (b < nums[i]){
            list2.offer(nums[i]);
            if (dfs(nums, i + 1)) return true;
            list2.poll();
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(new BufferedInputStream(System.in));
        int cases = cin.nextInt();
        String[] line;
        int[] nums = new int[10];
        cin.nextLine();

        for (int i = 0; i < cases; i++) {
            line = cin.nextLine().trim().split("\\s");
            for (int j = 0; j < 10; j++) {
                nums[j] = Integer.valueOf(line[j]);
            }
            if (new Main().isOk(nums)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}