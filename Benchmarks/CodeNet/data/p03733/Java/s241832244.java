import java.util.*;

public class Main{

    public static void main(String[] args)throws Exception{
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt(), w = sc.nextInt();
    	int[] ww = new int[n], vv = new int[n];
    	for(int i=0; i<n; i++){
    		ww[i] = sc.nextInt(); vv[i] = sc.nextInt();
    	}
    	int[][] res = new int[n+1][w+1];
    	for(int i=0; i<res.length; i++)
    		res[i][0]=0;
    	for(int i=0 ;i<res[0].length; i++)
    		res[0][i]=0;
    	for(int i=1; i<res.length; i++){
    		for(int j=1; j<res[0].length; j++){
    			if(ww[i-1]>j)	res[i][j] = res[i-1][j];
    			else{
    				res[i][j] = Math.max(res[i-1][j], res[i-1][j-ww[i-1]]+vv[i-1]);
    			}
    		}
    	}
    	System.out.println(res[n][w]);
    }
}

