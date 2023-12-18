import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] board = str.toCharArray();
        
        char current = board[0];
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i] != current) {
                count++;
                current = board[i];
            }
        }
        System.out.println(count);
    }
}