import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
       
        LinkedList<Integer> list = new LinkedList<Integer>();
//        int index = 0;
        ListIterator<Integer> it = list.listIterator();
        for(int i = 0; i < n; i++){
        	String[] tmpArray = br.readLine().split(" ");
        	
        	//insert
        	if(tmpArray[0].equals("0")){
//        		list.add(index, Integer.parseInt(tmpArray[1]));
        		it.add(Integer.parseInt(tmpArray[1]));
        		it.previous();
        	}
        	//move
        	else if(tmpArray[0].equals("1")){
//        		index += Integer.parseInt(tmpArray[1]);
        		int x = Integer.parseInt(tmpArray[1]);
        		
        		if(x > 0){
        			for(int j = 0; j < x; j++){
        				it.next();
        			}
        		}
        		else {
        			for(int j = 0; j < -x; j++){
        				it.previous();
        			}
        		}
        	}
        	//remove
        	else {
//        		list.remove(index);
        		it.next();
        		it.remove();
        	}
//        	printList(list);
//        	System.out.println("------");
        }
        
        printList(list);
    }
    
    static void printList(List list){
    	Iterator it = list.listIterator(0);
        
        while(it.hasNext()){
        	System.out.println(it.next());
        }
    }
    
}
