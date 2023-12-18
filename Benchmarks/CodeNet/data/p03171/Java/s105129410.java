import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] deque = new int[n];
        for(int i = 0 ; i < n ; i++) {
            deque[i] = scan.nextInt();
        }
        
        System.out.println(helper(deque, 0, n-1, true, new Long[n+1][n+1][2] ));
    }
    
    private static long helper(int[] deque, int i, int j, boolean player1, Long[][][] cache) {
        if(i == j) {
            return player1 ? deque[i] : -deque[i] ; // whoever reaches here should take away the best.
        }
        if(cache[i][j][player1?0:1] != null) {
            return cache[i][j][player1?0:1];
        }
        if(player1) {
             cache[i][j][player1?0:1] = Math.max(deque[i]+helper(deque, i+1, j, false, cache), deque[j]+helper(deque, i, j-1, false, cache));
             return cache[i][j][player1?0:1];
        } else {
            cache[i][j][player1?0:1] = Math.min(-deque[i]+helper(deque, i+1, j, true, cache) , -deque[j]+helper(deque, i, j-1, true, cache));
            return cache[i][j][player1?0:1];
        }
    }
}