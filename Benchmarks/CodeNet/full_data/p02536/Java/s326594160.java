import java.util.*;

public class Main {
    public static void main(String[] args){
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[][] a = new int[M][2];
        
        for(int i = 0; i < M; i++){
            for(int j = 0; j < 2; j++){
                a[i][j] = sc.nextInt();
            }
        }
        int neadLoad = N - 1;
        int result = neadLoad - M;
        
        System.out.println(result);
        
    }
    
}
