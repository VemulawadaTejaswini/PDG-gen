import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
	    InputStreamReader input = new InputStreamReader (System. in);
	    BufferedReader buffer = new BufferedReader(input);
	    String read = buffer.readLine();
	    int amount = Integer.parseInt(read);
	    ArrayList<Integer> tempList = new ArrayList<Integer>();
	    tempList.add(1);
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
//    	for(int i=0; i<amount; i++){
//    		foundPosition[i] = amount;
//    	}
    	boolean visitBranch[] = new boolean[amount];
    	visitBranch[0] = true;

    	while(true){
    		boolean existBranch = false;
    		//ArrayList<Integer> list = (ArrayList<Integer>) tempList.clone();
    		tempList.clear();
    		
    		for(int i=0; i<list.size(); i++){
    			foundPosition[list.get(i) -1 ] = nowDepth;
    		}
    		for(int i=0; i<list.size(); i++){
    			for(int j=0; j<scanInt[list.get(i)-1][1]; j++){
    				if(visitBranch[ scanInt[list.get(i)-1][j+2] -1] == false){
//    					System.out.println("found "+(scanInt[list.get(i)-1][j+2])+" depth= "+nowDepth );
    					visitBranch[ scanInt[list.get(i)-1][j+2] -1] = true;
    					existBranch = true;
    					tempList.add(scanInt[list.get(i)-1][j+2]);
    				}
    			}
    		}
    		if(existBranch == false){
    			for(int i=0; i<amount; i++){
    				if(visitBranch[i] == false){
    					foundPosition[i] = -1;
    				}
    			}
    			break;
    		}
    		nowDepth += 1;
	    }
    	for(int i=0; i<amount; i++){
    		System.out.println((i+1)+" "+foundPosition[i]);
    	}
	}
}