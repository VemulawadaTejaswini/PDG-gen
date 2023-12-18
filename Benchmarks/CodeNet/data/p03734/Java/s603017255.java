import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        int[] weight = new int[N];
        int[] sorted_w = new int[N];
        int[] value = new int[N];
        int[] sorted_v = new int[N];
        for(int n=0;n<N;n++){
        	weight[n] = sc.nextInt();
        	sorted_w[n]=weight[n];
        	value[n]=sc.nextInt();
        	sorted_v[n]=value[n];
        }
        Arrays.sort(sorted_w);
        Arrays.sort(sorted_v);
        
        int M = Math.min(N,W/sorted_w[0]);
        int m = Math.max(M,1+W/(sorted_w[N-1]));
        //the number of objects cannot be more than M or less than m
        int ans = 0;
        
        int heaviest = 0;
        for(int n=0;n<M;n++){
        	heaviest+= sorted_w[n];
        }
        if(heaviest<=W){//free to put M objects: the best way is putting the most expensive M obj.s
        	for(int n=0;n<M;n++) ans += sorted_v[n];
        }else if(weight[0]<=300){//not too heavy: DP useful?
        	int[][] dp = new int[N][M*sorted_w[N-1]];
        	for(int n=0;n<N;n++){
        		for(int w=0;w<M*sorted_w[N-1];w++){
        			if(n==0){
        				if(weight[0]>=w) dp[n][w]=0;
        				else dp[n][w]=value[0];
        			}else{
        				dp[n][w] = dp[n-1][w];
        				if(w>=weight[n] &&dp[n-1][w-weight[n]]+value[n]>dp[n-1][w]){
        					dp[n][w] = dp[n-1][w-weight[n]]+value[n];
        				}
        			}
        		}
        	}
        	ans = dp[N-1][W];
        }else{//m=M-1. I can put m objects
        	for(int n=0;n<M-1;n++) ans += sorted_v[n];
        }
        System.out.println(ans);
    }
}