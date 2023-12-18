import java.util.*;

public class Main {

    public static ArrayList<Integer> erathosthenes(int x) {
        int[] nums = new int[x];
        int[] flag = new int[x];
        for (int i=2;i<x;i++) {
            nums[i]=i;
        }
        for (int i=2;i<Math.sqrt(x);i++) {
            if (flag[i]==1) {
                continue;
            }
            for (int j=2;j*i<x;j++) {
                flag[j*i]=1;
            }
        }
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int i=2;i<x;i++) {
            if (flag[i]==0) {
                ans.add(nums[i]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        ArrayList<Integer> list = erathosthenes(200000);
        for (Integer x : list) {
            if (x>=X) {
                System.out.println(x);
                break;
            }
        }
    }
}