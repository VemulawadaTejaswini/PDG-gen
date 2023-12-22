import java.io.*;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// ??\????????????????????????
            String line;
            String[] listA = null;
            String[] listB = null;
            int count = 0;
            while ((line = br.readLine()) != null) {
            	if(count == 0){
            		count++;
            		listA = line.split(" ", 0);
            	}else{
            		count++;
            		listB = line.split(" ", 0);
            	}
            	if(count == 2){
            		count = 0;
	                blow(listA, listB);
            	}
            } 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static void blow(String[] listA, String[] listB) {
    	int hit = 0;
    	int blow = 0;
    	int i = 0;
    	int j = 0;
    	for(i = 0; i < 4; i++){
    		for(j = 0; j < 4; j++){
    			int rdmA = Integer.parseInt(listA[i]);
    			int rdmB = Integer.parseInt(listB[j]);	
    			if(i == j && rdmA == rdmB){
    				hit++;
    				break;
    			}else if(rdmA == rdmB && i != j){
    				blow++;
    			}
    		}
    	}
        System.out.println(hit + " " + blow);
    }
}