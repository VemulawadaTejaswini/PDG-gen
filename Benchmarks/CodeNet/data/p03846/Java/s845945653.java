import java.util.Scanner;

public class Main {
    static int n;
    static int[] dif;
    static long mod = 1000000007;

    static long solve(boolean[] used, int count) {
        if(used.length == count) return 1;

        int d = dif[count];
        int m = n / 2;
        long sum = 0;
        if(n % 2 == 1) {
            if(d == 0) {
                if(!used[m]) {
                    used[m] = true;
                    sum += solve(used, count + 1);
                    sum %= mod;
                    used[m] = false;
                }
            } else {
                int id = m + d /  2;
                if(!used[id]) {
                    used[id] = true;
                    sum += solve(used, count + 1);
                    sum %= mod;
                    used[id] = false;
                }
                id = m - d / 2;
                if(!used[id]) {
                    used[id] = true;
                    sum += solve(used, count + 1);
                    sum %= mod;
                    used[id] = false;
                }
            }
        } else {
            int id = m + d / 2;
            if(!used[id]) {
                used[id] = true;
                sum += solve(used, count + 1);
                sum %= mod;
                used[id] = false;
            }
            id = m - d / 2 - 1;
            if(!used[id]) {
                used[id] = true;
                sum += solve(used, count + 1);
                sum %= mod;
                used[id] = false;
            }
        }
        return sum;
    }

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        dif = new int[n];
        for(int i = 0; i < n; i++) {
            dif[i] = sc.nextInt();
        }

        if(n % 2 == 0) {
            for(int i = 0; i < n; i++) {
                if(dif[i] % 2 == 0) {
                    System.out.println(0);
                    return;
                }
            }
        }

        if(n % 2 == 1) {
            for(int i = 0; i < n; i++) {
                if(dif[i] % 2 == 1) {
                    System.out.println(0);
                    return;
                }
            }
        }

        boolean[] used = new boolean[n];
        System.out.println(solve(used, 0));
    }
}