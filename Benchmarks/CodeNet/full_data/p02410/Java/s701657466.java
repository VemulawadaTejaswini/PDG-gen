import java.util.Scanner;

class Main{
     public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    	int m = scan.nextInt();
    	
    	int[][] Vec_a = new int[n][m];
    	int[] Vec_b = new int[m];
    	int[] c = new int[n];

    	for(int j = 0; j < n; j++){
    		for(int i = 0; i < m; i++){
        		Vec_a[j][i] = scan.nextInt();
        	}
    	}
    	
    	for(int i = 0; i < m; i++){
    		Vec_b[i] = scan.nextInt();
    	}
    	
    	for(int j = 0; j < n; j++){
    		for(int i = 0; i < m; i++){
        		c[j] += Vec_a[j][i] * Vec_b[i]; 
        	}
    		System.out.println(c[j]);
    	}
    }
    	
}