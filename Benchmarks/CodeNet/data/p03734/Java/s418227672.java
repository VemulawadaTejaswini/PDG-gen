

import java.util.*;

public class Main{

    public static void main(String[] args)throws Exception{
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt(), w = sc.nextInt();
    	int[] ww = new int[n], vv = new int[n];
    	for(int i=0; i<n; i++){
    		ww[i] = sc.nextInt(); vv[i] = sc.nextInt();
    	}
    	int[] res = new int[w+1];
    	for(int i=0; i<=w; i++)
    		res[i] = 0;
    	for(int i=0; i<n; i++){
    		for(int j=w; j>=ww[i]; j--){
    			res[j] = Math.max(res[j], res[j-ww[i]]+vv[i]);
    		}
    	}
    	System.out.println(res[w]);
    }
}