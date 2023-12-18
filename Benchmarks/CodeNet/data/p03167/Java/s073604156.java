import java.util.*;

public class Main{
        public static void main(String[] args){
                Scanner in = new Scanner(System.in);
                int rows = in.nextInt();
                int columns = in.nextInt();

                int[][] dp = new int[rows][columns];
                String[] Grid = new String[rows];
                for(int i = 0; i < rows; ++i){
                        Grid[i] = in.next();
                }

                dp[0][0] = 1;
                for(int i=0; i< rows; i++){
                        String columnString = Grid[i];
                        for(int j =0; j<columns; ++j){
                                if(j < (columns- 1) && columnString.charAt(j+1) == '.'){
                                        dp[i][j+1] += dp[i][j];
                                }
                                if(i < rows-1){
                                        char nextRowChar = Grid[i+1].charAt(j);
                                        if(nextRowChar == '.'){
                                                dp[i+1][j] += dp[i][j];
                                        }
                                }
                        }
                }

                System.out.println(dp[rows-1][columns-1]);
        }       
} 