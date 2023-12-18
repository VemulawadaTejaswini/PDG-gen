import java.util.Scanner;
public class Main{
    static int[][] mat = new int[3][3];
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        int i, j;
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        
        System.out.println(
        (mat[0][0] - mat[0][1] == mat[1][0] - mat[1][1] && mat[1][0] - mat[1][1] == mat[2][0] - mat[2][1] &&
         mat[0][1] - mat[0][2] == mat[1][1] - mat[1][2] && mat[1][1] - mat[1][2] == mat[2][1] - mat[2][2] &&
         mat[0][0] - mat[1][0] == mat[0][1] - mat[1][1] && mat[0][1] - mat[1][1] == mat[0][2] - mat[1][2] &&
         mat[1][0] - mat[2][0] == mat[1][1] - mat[2][1] && mat[1][1] - mat[2][1] == mat[1][2] - mat[2][2])
        ? "Yes" : "No");
    }
}