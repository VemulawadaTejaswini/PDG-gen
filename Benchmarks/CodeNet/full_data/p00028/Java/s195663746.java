import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String buf;
    	int num;
    	HashMap<Integer, Integer> numH = new HashMap<Integer, Integer>();
    	try{
    		while((buf = br.readLine())!=null)
    		{
    			if(buf.isEmpty()||buf==null)
    				break;
    			num = Integer.parseInt(buf);
    			if(numH.containsKey(num))
    				numH.put(num, numH.get(num)+1);
    			else numH.put(num,1);
    		}
    	HashSet<Integer> maxNums = new HashSet<Integer>();
    	int maxValue =0;
    	for(int key:numH.keySet()){
    		if(numH.get(key)< maxValue)continue;
    		if(numH.get(key)> maxValue){
    			maxValue=numH.get(key);
    			maxNums.clear();
    		}
			maxNums.add(key);
    	}
    	
    	for(int i:maxNums)
    		System.out.println(i);
    			
    	}catch (Exception e){
    		e.printStackTrace();
    	}
	}
}