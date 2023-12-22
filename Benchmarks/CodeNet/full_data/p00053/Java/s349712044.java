import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args){
		BufferedReader reader = 
				new BufferedReader(new InputStreamReader(System.in));
    
    int n,s;
    boolean is;
    
    try{
    while((n = Integer.parseInt(reader.readLine())) != 0){
    	s = 0;
    	
    	for(int i = 2; n != 0; i++){
    		is = true;
    		for(int j = 2; j <= Math.sqrt(i); j++)
    			if(i % j == 0)is = false;
    		
    		if(is){
    			n--;
    			s += i;
    		}
    	}
    	System.out.println(s);
    }
    reader.close();
    }catch(IOException e){
    }
  }
}