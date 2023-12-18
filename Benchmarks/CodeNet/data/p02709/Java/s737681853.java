

import java.util.List;
import java.util.Scanner;

public class Main {
    static class Solution {

        public void find(int[] arr) {
                int res = findMax(arr, new boolean[arr.length]);
                System.out.println(res);
        }

        int findMax(int[] arr, boolean[] visited) {

            int max = 0;
            for(int j=1; j<arr.length; j++) {
                if(visited[j]) continue;
                visited[j] = true;
                for(int i= j+1; i<arr.length; i++) {
                    if(visited[i]) continue;
                    visited[i] = true;

                    int diff = Math.abs(j-i);
                    int sum = arr[j]*diff + arr[i]*diff;
                    int val = findMax(arr, visited) + sum;
                    max = Math.max(max, val);
                    visited[i] = false;
                }
                visited[j] = false;

            }
            return max;

        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i=1; i<=n; i++) {
            arr[i] = sc.nextInt();
        }
        sol.find(arr);
    }
}

