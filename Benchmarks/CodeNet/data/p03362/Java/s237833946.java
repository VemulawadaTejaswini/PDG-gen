import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int cnt = 0;
        for (Integer i : erathosthenes(55555)) {
            if (i%5==2) {
                System.out.println(i);
                cnt++;
            }
            if (cnt==N) {
                break;
            }
        }
    }
    public static ArrayList<Integer> erathosthenes(int x) {
        int[] nums = new int[x-1];
        int[] flag = new int[x-1];
        for (int i=0;i<x-1;i++) {
            nums[i]=i+2;
        }
        for (int i=0;i<Math.sqrt(x);i++) {
            if (flag[i+2]==1) {
                continue;
            }
            for (int j=2;j*(i+2)<x-1;j++) {
                flag[j*nums[i]-2]=1;
            }
        }
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int i=0;i<x-1;i++) {
            if (flag[i]==0) {
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}