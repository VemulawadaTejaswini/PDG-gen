import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
 
 
public class Main{
     
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	
    	final int N = sc.nextInt();
    	
    	List<String> id_list = new LinkedList<String>();
    	
    	for(int i = 0; i < N; i++){
    		id_list.add(sc.next());
    	}
    	
    	final int M = sc.nextInt();
    	
    	boolean is_open = false;
    	for(int i = 0; i < M; i++){
    		String id = sc.next();
    		
    		if(id_list.contains(id)){
    			is_open = !is_open;
    			System.out.println((is_open ? "Opened by " : "Closed by ") + id);
    		}else{
    			System.out.println("Unknown " + id);
    		}
    	}
    	
    }
     
}