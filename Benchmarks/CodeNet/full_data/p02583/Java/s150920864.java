import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class tri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner s = new Scanner(System.in);
	    
	    int n = s.nextInt();
	    ArrayList<Long> list = new ArrayList<Long>();
	    
	    for(int i = 0; i < n; i++) {
	    	
	    	list.add(s.nextLong());
	    	
	    }
	    
	    Collections.sort(list);
	    
	    int cnt = 0;
	    
	    for(int i = 0; i < list.size()-2; i++) {
	    	
	    	for(int j = i+1; j < list.size()-1; j++) {
	    		
	    		for(int k = j+1; k < list.size(); k++) {
	    			
	    			if((list.get(i) != list.get(j) && list.get(j) != list.get(k) && list.get(i) != list.get(k)) && list.get(i) + list.get(j) > list.get(k))
	    				cnt += 1;
	    			
	    		}
	    		
	    	}
	    	
	    }
	    
	    System.out.println(cnt);
	    
	}

}