import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int M[] = new int[n+1];
        int DP[][] = new int[n+1][n+1];
        Arrays.fill(M,0);
        for(int i=0;i<n+1;i++) Arrays.fill(DP[i],0);
        for(int i=1;i<=n;i++){
            M[i-1] = sc.nextInt();
            M[i] = sc.nextInt();
        }
        for(int l=2;l<=n;l++){
            for(int i=1;i<=n-l+1;i++){
                int j = i+l-1;
                int min_cost = 999999999;
                for(int k=i;k<j;k++){
                    if(k==i) min_cost = DP[i][k]+DP[k+1][j]+M[i-1]*M[k]*M[j];
                    else min_cost = Math.min(min_cost,DP[i][k]+DP[k+1][j]+M[i-1]*M[k]*M[j]);
                }
                DP[i][j] = min_cost;
            }
        }
        System.out.println(DP[1][n]);
    }
}
