import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int[] b = new int[m];
        for(int i = 0; i < m; i++){
            b[i] = Integer.parseInt(sc.next());
        }
        int[][] a = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                a[i][j] = Integer.parseInt(sc.next());
            }
        }
        
        int count = 0;
        for(int i = 0; i < n; i++){
            int code = c;
            for(int j = 0; j < m; j++){
                code += a[i][j] * b[j];
            }
            if(code > 0){
                count++;
            }
        }
        
        System.out.println(count);
    }
}