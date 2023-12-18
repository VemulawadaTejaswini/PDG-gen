import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int answer = 0;
        int[][] b = new int[n][n];
        for(int j=0; j<n; j++){
            if((a[j]%m)==0){
                answer++;
            }
            b[0][j] = a[j]%m;
        }
        for(int i=1; i<n; i++){
            for (int j=0; j<n; j++){
                b[i][j] = 0;
            }
        }
        for(int i=1; i<n; i++){
            for(int j=0; j<n-i; j++){
                for(int k=0; k<i; k++){
                    if((b[j][k-j+1] + b[j+k+1][i-k-1])%m==0){
                        b[i][j] = 1;
                        answer++;
                        break;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}