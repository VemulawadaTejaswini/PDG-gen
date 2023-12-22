import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
	    InputStreamReader input = new InputStreamReader (System. in);
	    BufferedReader buffer = new BufferedReader(input);
	    String read = buffer.readLine();
	    int amount = Integer.parseInt(read);
	    Deque<Integer> stack = new ArrayDeque<Integer>();
	    stack.add(0);
	    int[][] scanInt = new int[amount][100];
	    for(int i=0; i<amount; i++){
	    	read = buffer.readLine();
	    	String[] scan = read.split(" ");
	    	for(int j=0; j<scan.length; j++){
	    		scanInt[i][j] = Integer.parseInt(scan[j]);
	    	}
	    }
	    int[] foundTime = new int[amount];
	    int[] compTime = new int[amount];
	    int time = 1;
	    
	    while(true){
	    	int process = stack.peek();
	    	boolean branchIsRemain = false;
	    	if(foundTime[process] == 0){
	    		foundTime[process] = time;
	    	}
	    	compTime[process]= time+1;
	    	
	    	for(int i=2; i<2+scanInt[process][1]; i++){
	    		
	    		if(foundTime[-1 + scanInt[process][i]] == 0){
	    			stack.addFirst(-1 + scanInt[process][i]);
	    			branchIsRemain = true;
	    			break;
	    		}
	    	}
	    	if(branchIsRemain == false){
	    		stack.pop();
	    	}
	    	if(stack.isEmpty()){
	    		break;
	    	}
	    	
	    	time++;
	    }
	    for (int i=0; i<amount; i++){
	    	System.out.println((i+1)+" "+foundTime[i]+" "+compTime[i]);
	    }

	}
}