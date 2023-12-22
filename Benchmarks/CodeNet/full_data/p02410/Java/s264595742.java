import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arrayA[][] = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arrayA[i][j] = sc.nextInt();
            }
        }
        int arrayB[] = new int[m];
        for(int i = 0; i < m; i++){
            arrayB[i] = sc.nextInt();
        }
       
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = 0; j < m; j++){
                sum += arrayA[i][j] * arrayB[j];
            }
            System.out.println(sum);
        }
        
    }
}
