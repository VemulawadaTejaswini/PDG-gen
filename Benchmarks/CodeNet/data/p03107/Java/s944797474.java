import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {

    	try(BufferedReader r = new BufferedReader(new InputStreamReader(System.in))){

    		String S = r.readLine();
    		List<Character> cs = S.chars().mapToObj(c -> (char)c).collect(Collectors.toCollection(LinkedList::new));

	    	int cnt = 0;
	    	int start = 0;
	    	boolean done = false;

	    	while(true) {
	    		done = false;
	    		for(int i=start; i < cs.size(); i++) {
	    			try {
		    			if(!cs.get(i).equals(cs.get(i+1))) {
		    				cnt+=2;
		    				start=i;
		    				done = true;
		    				cs.remove(i);
		    				cs.remove(i);
		    				break;
		    			}
	    			} catch(Exception e) {
	    				break;
		    		}
	    		}

	    		if(!done)break;
	    	}

	    	System.out.println(cnt);
    	}
    }
}