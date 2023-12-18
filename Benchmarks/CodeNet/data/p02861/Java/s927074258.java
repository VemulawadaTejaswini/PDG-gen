import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] xy = new int[n][2];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 2; j++){
                xy[i][j] = scan.nextInt();
            }
        }
        int count = 2 * factional(n - 1);
        double sum = 0;
        try{
            for(int i = 0; i < n; i++){
                sum += Math.sqrt(Math.pow(xy[i][0] - xy[i + 1][0], 2) + Math.pow(xy[i][1] - xy[i + 1][1], 2));
            }
        }catch(ArrayIndexOutOfBoundsException e){
            
        }
        System.out.println(sum * count / factional(n));
    }
    static int factional(int n){
        int r = 1;
        for(int i = 1; i <= n; i++){
            r *= i;
        }
        return r;
    }
}