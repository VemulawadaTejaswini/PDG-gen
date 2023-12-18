import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int[][] a = new int[3][3];
        boolean[][] isMarked = new boolean[3][3];

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                a[i][j] = stdIn.nextInt();
            }
        }

        int n = stdIn.nextInt();
        for(int t=0; t<n; t++){
            int x = stdIn.nextInt();
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    if(a[i][j] == x){
                        isMarked[i][j] = true;
                    }
                }
            }
        }

        System.out.println(isBingo(isMarked) ? "Yes" : "No");
    }

    static boolean isBingo(boolean[][] isMarked){
        if(isMarked[0][0] && isMarked[0][1] && isMarked[0][2]){
            return true;
        }
        if(isMarked[1][0] && isMarked[1][1] && isMarked[1][2]){
            return true;
        }
        if(isMarked[2][0] && isMarked[2][1] && isMarked[2][2]){
            return true;
        }
        if(isMarked[0][0] && isMarked[1][0] && isMarked[2][0]){
            return true;
        }
        if(isMarked[0][1] && isMarked[1][1] && isMarked[2][1]){
            return true;
        }
        if(isMarked[0][2] && isMarked[1][2] && isMarked[2][2]){
            return true;
        }
        if(isMarked[0][0] && isMarked[1][1] && isMarked[2][2]){
            return true;
        }
        if(isMarked[0][2] && isMarked[1][1] && isMarked[2][0]){
            return true;
        }
        return false;
    }
}