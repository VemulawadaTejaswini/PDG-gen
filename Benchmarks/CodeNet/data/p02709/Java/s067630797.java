import java.util.*;
public class Main
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); Student[] a = new Student[n];
        for (int i = 0; i < n; i++) a[i] = new Student(i, sc.nextInt());
        Arrays.sort(a); long [][] dp = new long [n+1][n+1];
        dp[0][0] = 0;
        for (int sum = 1; sum <= n; sum++) {
            Student toPut = a[sum - 1];
            int idx = toPut.index; long act = toPut.act;
            for (int left = 0; left <= sum; left++) {
                int right = sum - left;
                if (left == 0) {
                    dp[left][right] = dp[left][right - 1] + Math.abs(idx - (n - right)) * act;
                } else if (left == sum) {
                    dp[left][right] = dp[left - 1][right] + Math.abs(idx - (left - 1)) * act;
                } else {
                    dp[left][right] = Math.max(dp[left][right - 1] + Math.abs(idx - (n - right)) * act,
                            dp[left - 1][right] + Math.abs(idx - (left - 1)) * act);
                }
            }
        }
        long res = 0;
        for (int i = 0; i <= n; i++) {
            res = Math.max(res, dp[i][n-i]);
        }
        System.out.println(res);
    }

    static class Student implements Comparable<Student> {
        int index; long act;
        Student(int index, long act) {
            this.index = index; this.act = act;
        }

        @Override
        public int compareTo(Student o) {
            return -1*Long.compare(act, o.act);
        }
    }



}
