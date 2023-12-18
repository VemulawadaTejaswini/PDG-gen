import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int max = 0;
        int min = 999;
        int bingo[][] = new int[3][3];
        boolean masu[][] = new boolean[3][3];
        boolean ans = false;

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; i++){
                bingo[i][j] = scan.nextInt();
                masu[i][j] = false;
                if(bingo[i][j] > max) max = bingo[i][j];
                if(bingo[i][j] < min) min = bingo[i][j];
            }
        }

        int n = scan.nextInt();
        for(int k = 0; k < n; k++){
            int s = scan.nextInt();
            if(min <= s && s <= max){
                for(int i = 0; i < 3; i++){
                    for(int j = 0; j < 3; i++){
                        if(bingo[i][j] == s) masu[i][j] = true;
                    }
                }
            }
            else continue;
        }

        for(int i = 0; i < 3; i++){
            if(masu[i][0] && masu[i][1] && masu[i][2]) ans = true;
            if(masu[0][i] && masu[1][i] && masu[2][i]) ans = true;
            if(masu[i][2 - i] && masu[2 - i][i] && masu[1][1]) ans = true;
        }
        if(masu[0][0] && masu[1][1] && masu[2][2]) ans = true;

        if(ans) System.out.println("Yes");
        else System.out.println("No");

    }
}