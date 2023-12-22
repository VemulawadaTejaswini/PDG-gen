import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();
        int arrayA[][] = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arrayA[i][j] = sc.nextInt();
            }
        }
        int arrayB[][] = new int[m][l];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < l; j++){
                arrayB[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < l; j++){
                long sum = 0;
                for(int k = 0; k < m; k++){
                    sum += arrayA[i][k] * arrayB[k][j];
                }
                if(j != 0){
                    System.out.print(" ");
                }
                System.out.print(sum);
            }
            System.out.println();
        }
        
        
    }
}
