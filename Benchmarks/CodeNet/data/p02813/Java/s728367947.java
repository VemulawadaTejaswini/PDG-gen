import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        int[] q = new int[n];
        for (int i = 0;i<n;i++) {
            p[i] = sc.nextInt();
        }
        for (int i = 0;i<n;i++) {
            q[i] = sc.nextInt();
        }

        int[] memo = new int[9];
        memo[1] = 1;
        memo[2] = 2;
        for (int i = 3; i< 9;i++) {
            memo[i]= i * memo[i-1];
        }

        int a = getNum(n, p, memo);
        int b = getNum(n, q, memo);
        System.out.println(Math.abs(a - b ));
    }
    
    private static int getNum(int n, int[] p, int[] memo){
        int a =0;
        Set<Integer> used = new HashSet<>();
        for (int i = 0;i < n;i++) {
            int pre = 0;
            used.add(p[i]);
            for (int j = 1;j <= p[i]; j++) {
                if (!used.contains(j)) pre++;
            }
            if (pre > 0) a += (pre) * (memo[n-i-1]);
        }
        return a;
    }
}