import java.util.*;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt();
        int W = sc.nextInt();
        int[][] c = new int[10][10];
        int[][] A = new int[H][W];

        for(int i=0; i<=9; i++){
            for(int j=0; j<=9; j++){
                c[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                for(int k=0; k<10; k++){
                    int x = c[i][k] + c[k][j];
                    if(x<c[i][j]){
                        c[i][j] = x;
                    }
                }
            }
        }
        long ans = 0L;
        for(int i=0; i<H; i++){
            for(int j=0; j<W; j++){
                A[i][j] = sc.nextInt();
                if(A[i][j]!=1 && A[i][j]!=-1){
                    ans += c[A[i][j]][1];
                }
            }
        }
        System.out.println(ans);
    }
}