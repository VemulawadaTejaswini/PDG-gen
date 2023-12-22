import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
	    InputStreamReader input = new InputStreamReader (System. in);
	    BufferedReader buffer = new BufferedReader(input);
	    String scan = buffer.readLine();
	    int vartAmount = Integer.parseInt(scan);
    	int[][] reachCost = new int[vartAmount][vartAmount];
    	int[][] scanInt = new int[vartAmount][vartAmount];
    	long processStart = System.currentTimeMillis();
    	boolean[] visited = new boolean[vartAmount];

    	for(int i=0; i<vartAmount; i++){
        	for(int k=0; k<vartAmount; k++){
        		reachCost[i][k] = 2001;
        	}
    	}

    	for(int i=0; i<vartAmount; i++){
    		scan = buffer.readLine();
    		String vart[] = scan.split(" ");
    		for(int k=0; k<vartAmount; k++){
    			scanInt[i][k] = Integer.parseInt(vart[k+1]);
    		}
    	}


    	for(int i=0; i<vartAmount; i++){
    		for(int k=0; k<vartAmount; k++){
    			if(scanInt[i][k] < reachCost[i][k] && scanInt[i][k] != -1){
    				reachCost[i][k] = scanInt[i][k];
    			}
//    			System.out.println(i+" "+k+"???????????? "+reachCost[i][k]);
    		}
    	}
    	int distance = 0;
    	int total = 0;
    	while(true){
    		for(int i=0; i<vartAmount; i++){
	    		for(int k=0; k<vartAmount; k++){
	    			if(reachCost[i][k] == distance){
	    				if(visited[i] == false || visited[k] == false){
	    					visited[i] = true;
	    					visited[k] = true;
	    					total += distance;
	    				}
	    			}
	    		}
    		}
    		distance += 1;
    		int isEnd = 0;
    		for(int i=0; i<vartAmount; i++){
    			if(visited[i] == true){
    				isEnd += 1;
    			}
    		}
    		if(isEnd == vartAmount){
    			break;
    		}
    	}



    	System.out.println(total);




    	long processEnd = System.currentTimeMillis();
//    	System.out.println("???????????????" + (processEnd - processStart)  + "ms");
	}
}