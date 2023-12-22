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
	    int[][] scanInt = new int[amount][100];	//N?????°???100????¶??????????
	    for(int i=0; i<amount; i++){
	    	read = buffer.readLine();
	    	String[] scan = read.split(" ");
	    	for(int j=0; j<scan.length; j++){
	    		scanInt[i][j] = Integer.parseInt(scan[j]);
	    	}
	    }

    	int nowDepth = 0;
    	int[] foundPosition = new int[amount];
    	for(int i=0; i<amount; i++){
    		foundPosition[i] = amount;
    	}
    	boolean visitBranch[] = new boolean[amount];
    	while(true){
    		if(stack.isEmpty()){
    			for(int j=0; j<amount; j++){
    				if(visitBranch[j] == false){
    					foundPosition[j] = -1;
    				}
    			}
    			break;
    		}
    		
    		boolean isBranch = false;
    		int nowPosition = stack.poll();
    		visitBranch[nowPosition] = true;
    		if(foundPosition[nowPosition]  > nowDepth){		//????§??????????????????¢????¨????
    			foundPosition[nowPosition] = nowDepth;
    		}
    		for(int i=0; i<scanInt[nowPosition][1]; i++){		//?§?????????????????????¨????????????????????¶?????????
    			if(visitBranch[ scanInt[nowPosition][2+i] -1 ] == false){
//    				visitBranch[ scanInt[nowPosition][2+i] -1 ] = true;
    				stack.addFirst(scanInt[nowPosition][2+i] -1 );
    				isBranch = true;
    			}
    		}
    		if(isBranch == false){
    			nowDepth -= 1;
    		}

    		nowDepth += 1;

	    }
    	for(int i=0; i<amount; i++){
    		System.out.println((i+1)+" "+foundPosition[i]);
    	}
	}
}