import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	HashMap<String,String> c = new HashMap<String,String>();
    	
    	while(true){
				int tn = Integer.parseInt(in.nextLine());
			
				if(tn == 0) break;
    			    
    			for(int i=0; i < tn; i++){
    				String[] tl = in.nextLine().split(" ");
    				c.put(tl[0],tl[1]);
    			}
	    		
    			int wn = Integer.parseInt(in.nextLine());
    			StringBuilder answer = new StringBuilder(); 
   
    			for(int i=0; i < wn; i++){
    				String word = in.nextLine();
    				if(c.containsKey(word)){
    					answer.append(c.get(word));
    				}else{
    					answer.append(word);
    				}
    			}
             System.out.println(answer.toString());
    	}
    }
}