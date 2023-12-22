import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

class Main {
    public static void main(String[] args) throws IOException {
	    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    	
	    	ArrayList<Integer> arr = new ArrayList<Integer>();
	    	for(int i=0;i<10;i++) {
	    		String str = reader.readLine();
	    		arr.add(Integer.parseInt(str));
	    	}
	    	Collections.sort(arr);
	    	Collections.reverse(arr);
	    	for(int i=0;i<3;i++) {
	    		System.out.println(""+arr.get(i));
	    	}
    }
}