import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
	    InputStreamReader input = new InputStreamReader (System. in);
	    BufferedReader buffer = new BufferedReader(input);
	    String read = buffer.readLine();
	    int amount = Integer.parseInt(read);
	    int[][] graph = new int[amount][amount];

	    for(int i=0; i<amount; i++){
	    	read = buffer.readLine();
	    	String[] scan = read.split(" ");
	    	int[] scanInt = new int[scan.length];
	    	for(int j=0; j<scan.length; j++){
	    		scanInt[j] = Integer.parseInt(scan[j]);
	    	}
	    	for(int j=2; j<scanInt[1]+2; j++){
	    		graph[i][scanInt[j]-1] = 1;
	    	}
	    }
    	for(int j=0; j<amount; j++){
    		for(int k=0; k<amount; k++){
    			System.out.print(graph[j][k]);
        		if(k == amount-1){
        			System.out.println("");
        		}
        		else{
        			System.out.print(" ");
        		}
    		}
    	}
	}
}