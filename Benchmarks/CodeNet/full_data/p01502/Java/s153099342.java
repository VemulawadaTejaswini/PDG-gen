import java.util.Scanner;
 
 
public class Main{
     
    public static void main(String[] args){
    	
    	final Scanner sc = new Scanner(System.in);
    	
    	final int n = sc.nextInt();
    	
    	long sum = 0;
    	int[][] adj = new int[n][n];
    	
    	for(int i = 0; i < n; i++){
    		for(int j = 0; j < n; j++){
    			adj[i][j] = sc.nextInt();
    		}
    	}
    	
    	for(int i = 0; i < n; i++){
    		for(int j = i + 1; j < n; j++){
    			sum += Math.min(adj[i][j], adj[j][i]);
    		}
    	}
    	
    	System.out.println(sum);
    	
    }
     
}