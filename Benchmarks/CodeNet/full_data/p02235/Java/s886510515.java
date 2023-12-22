import java.util.Scanner;


public class Main {

    static int N = 1000;
    
    public static int lcs(String X, String Y) {
        int result = 0;
        int maxl = 0;
        int c[][] = new int[N+1][N+1];
        int m = X.length();
        int n = Y.length();
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++) {
                String s1 = String.valueOf(X.charAt(i-1));
                String s2 = String.valueOf(Y.charAt(j-1));
                if(s1.equals(s2)){
                    c[i][j] = c[i-1][j-1] +1;
                } else {
                    if(c[i-1][j] >= c[i][j-1]){
                        c[i][j] = c[i-1][j];
                    } else {
                        c[i][j] = c[i][j-1];
                    } 
                }
                if(maxl >= c[i][j]){
                   result = maxl;
                } else {
                   result = c[i][j];
                }
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for(int i = 0; i < q; i++) {
            String X = sc.next();
            String Y = sc.next();
            System.out.println(lcs(X, Y));
        }
        
    }
    
}