import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int a[][] = new int[n][n - 1];
        int now[] = new int[n];
        int count = 0;
        boolean flag = true;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - 1; j++){
                a[i][j] = stdIn.nextInt();
            }
            now[i] = 0;
        }
        
        System.out.println(-1);
    }
}
