import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] a = new long[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        long answer = 0;
        long[][] b = new long[n][n];
        for(int j=0; j<n; j++){
            b[0][j] = a[j];
            if((b[0][j]%m)==0){
                answer++;
            }
        }
        for(int i=1; i<n; i++){
            for(int j=0; j<n-i; j++){
                b[i][j] = b[0][j]+b[i-1][j+1];
                    if(b[i][j]%m==0){
                        answer++;
                    }
            }
        }
        System.out.println(answer);
    }
}