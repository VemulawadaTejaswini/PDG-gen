//package Test;

import java.util.*;

public class Main {

    static class Solution {

        void solve(int n, Integer[] a, Integer[] b){
            Arrays.sort(b, Collections.reverseOrder());
            int common = -1;
            for(int i = 0; i < n; i++) {
                if(a[i] == b[i]) {
                    common = a[i];
                    break;
                }
            }
            int l = n, r = -1;
            for(int i = 0; i < n; i++) {
                if(a[i] == common && b[i] == common) {
                    l = Math.min(l, i);
                    r = Math.max(r, i);
                }
            }
            for(int i = 0; i < n; i++) {
                if(a[i] != common && b[i] != common && l <= r) {
                    int t = b[i];
                    b[i] = b[l];
                    b[l] = t;
                    l++;
                }
            }
            if(l <= r) {
                System.out.println("No");
                return;
            }
            System.out.println("Yes");
            for(int i = 0; i < n; i++) {
                System.out.print(b[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] a = new Integer[n];
        Integer[] b = new Integer[n];
        for(int i = 0; i < n; i++) a[i] = scanner.nextInt();
        for(int i = 0; i < n; i++) b[i] = scanner.nextInt();
        Solution solution = new Solution();
        solution.solve(n, a, b);
    }
}
