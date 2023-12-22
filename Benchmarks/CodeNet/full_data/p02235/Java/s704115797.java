import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int q = Integer.parseInt(sc.next());
        for(int i = 0; i < q; i++){
            char[] x = sc.next().toCharArray();
            char[] y = sc.next().toCharArray();
            System.out.println(lcs(x, y));
        }
    }
    
    static int lcs(char[] x, char[] y){
        
        int m = x.length;
        int n = y.length;
        int[][] c = new int[m+1][n+1];
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(x[i-1] == y[j-1]){
                    c[i][j] = c[i-1][j-1] +1;
                }else if(c[i-1][j] >= c[i][j-1]){
                    c[i][j] = c[i-1][j];
                }else{
                    c[i][j] = c[i][j-1];
                }
            }
        }
        return c[m][n];
    }
}
