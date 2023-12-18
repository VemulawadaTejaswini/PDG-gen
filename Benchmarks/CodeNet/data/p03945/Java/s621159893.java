import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        String input = scan.next();
        char[] board = input.toCharArray();

        // search
        int count = 0;
        char temp = board[0];
        for(int i = 1; i < board.length; i++){
            if(temp != board[i]){
                count++;
                temp = board[i];
            }
        }

        // answer
        System.out.println(count);

    }
}