import java.util.Scanner;
 
class Main{
    	public static void main(String[] args){
        	Scanner sc = new Scanner(System.in);
        	int x = sc.nextInt();
	        int y = sc.nextInt();
	        int z = sc.nextInt();
	        long[][] a = new long[x][y];
	        long[][] b = new long[y][z];
	        long[][] c = new long[x][z];
         
	        for(int i=0; i<x; i++){
        		for(int j=0; j<y; j++){
                		a[i][j] = sc.nextInt();
            		}
        	}
        	for(int i=0; i<y; i++){
            		for(int j=0; j<z; j++){
                		b[i][j] = sc.nextInt();
            		}
        	}
         
        	for(int i=0; i<x; i++){
            		for(int j=0; j<z; j++){
                		for(int k=0; k<y; k++){
                    			c[i][j] += a[i][k] * b[k][j];
                		}
            		}
        	}
        	for(int i=0; i<x; i++){
            		for(int j=0; j<z; j++){
                		System.out.print(c[i][j]);
                		if(j != z-1){
                    			System.out.print(" ");
                		}
            		}
            		System.out.println();
        	}
    	}
}