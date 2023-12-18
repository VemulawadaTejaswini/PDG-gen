import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public int getWinner(int[] A, int stones, int player, int[][] memo) {
      int n = A.length;
      if (stones < A[0]) {
          // current player loses, return the winner
          return 1 - player;
      }
      if (memo[player][stones] != 0) {
          return memo[player][stones];
      }
      for (int num: A) {
        if (player == getWinner(A, stones - num, 1 - player, memo)) {
            return memo[player][stones] = player;
        }
      }
      return memo[player][stones] = 1 - player;
    }
    public static void main(String[] args)  {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String a = br.readLine();
            String b = br.readLine();
          	Main app = new Main();
            int stones = Integer.parseInt(a.split(" ")[1]);
            String[] split = b.split(" ");
            int[] A = new int[split.length];
            for (int i = 0; i < split.length; i++) {
               A[i] = Integer.parseInt(split[i]); 
            }
            int[][] memo = new int[2][stones + 1];
            int result = app.getWinner(A, stones, 0, memo);
            System.out.println(result == 0 ? "First" : "Second");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
