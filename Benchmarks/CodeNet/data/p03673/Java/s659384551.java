import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        int[][] a = new int[3][N];

        for(int i=0; i<N; i++){
            a[0][i] = sc.nextInt();
        }

        int x = 1;

        for(int i=0; i<N; i++){
            a[1][i] = a[0][i];
            for(int j=0; j<=i; j++){
                a[2][j] = a[1][i - j];
            }
            for(int j=0; j<=i; j++){
                a[1][j] = a[2][j];
            }
        }
        for(int i=0; i<N; i++){
            if(i==0){
                System.out.print(a[x][i]);
            }
            else{
                System.out.print(" " + a[x][i]);
            }
        }
    }
}