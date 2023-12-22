import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    static final FS sc = new FS();  // 封装输入类
    static final PrintWriter pw = new PrintWriter(System.out);
    static final int mod = (int)1e9 + 7;
    static int[] a;
    static int n, k;
    public static void main(String[] args) {
        n = sc.nextInt();
        k = sc.nextInt();
        a = sc.nextArray(n);
        List<Integer> nums = new ArrayList<>();
        for(int num : a) {
            if (num != 0)
                nums.add(num);
        }
        if (nums.size() < k) {
            pw.println(0);
            pw.flush();
            return;
        }
        nums.sort(Comparator.comparingInt(Math::abs));
        for(int i = 0;i < n;i++) {
            a[i] = nums.get(i);
        }
        long res = 1;
        int rightPos = -1, rightNeg = -1, leftPos = -1, leftNeg = -1;
        for(int i = n - k; i < n; i++){
            res = (res * a[i]) % mod;
            if(rightPos == -1 && a[i] > 0) rightPos = i;
            if(rightNeg == -1 && a[i] < 0) rightNeg = i;
        }
        for(int i = n - k - 1; i >= 0; i--){
            if(leftPos == -1 && a[i] > 0) leftPos = i;
            if(leftNeg == -1 && a[i] < 0) leftNeg = i;
        }

        if(res < 0 && n != k){
            if(rightPos == -1){
                if(leftPos == -1){
                    res = 1;
                    for(int i = 0; i < k; i++)
                        res = (res * a[i]) % mod;
                } else {
                    swap(a, leftPos, rightNeg);
                    res = calc(a);
                }
            } else {
                if(leftNeg == -1){
                    swap(a, leftPos, rightNeg);
                    res = calc(a);
                } else if(leftPos == -1){
                    swap(a, leftNeg, rightPos);
                    res = calc(a);
                } else {
                    int[] c1 = a, c2 = a;
                    swap(c1, leftNeg, rightPos);
                    swap(c2, leftPos, rightNeg);
                    res = Math.max(calc(c1), calc(c2));
                }
            }
        }

        pw.println(res < 0 ? res + mod : res);
        pw.flush();
    }


    private static long calc(int[] nums) {
        long temp = 1;
        for(int i = n - k; i < n; i++)
            temp = (temp * nums[i]) % mod;
        return temp;
    }

    private static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    static class FS {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");
        String next() {
            while(!st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch(Exception ignored) {}
            }
            return st.nextToken();
        }
        int[] nextArray(int n) {
            int[] a = new int[n];
            for(int i = 0;i < n;i++) {
                a[i] = nextInt();
            }
            return a;
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
    }
}