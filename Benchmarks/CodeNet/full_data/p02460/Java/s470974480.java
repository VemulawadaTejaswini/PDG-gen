//import java.lang.Math;
import java.util.*;
//import java.util.ListIterator;
//import java.util.Iterator;
//import java.util.LinkedList;
 
public class Main{
	
	
	
	@SuppressWarnings({ "rawtypes", "unchecked", "resource" })
	public static void main(String[] arg) {
		
		
		Map map=new HashMap();
		 Scanner sc = new Scanner(System.in);
	        int cnt = sc.nextInt();
	        for (int i = 0; i < cnt; i++) {
	        
	        int cmt=sc.nextInt();
	        
	        switch(cmt){
	        
	        
	        case 0:
	        	  String str=sc.next();
	              int num=sc.nextInt();
	        
	               map.put(str,num);
	            break;
	        case 1:
	        	str=sc.next();
	        	if(map.containsKey(str))System.out.println(map.get(str));
	        	else System.out.println(0);
	        	break;
	        case 2:
	        	str=sc.next();
	        	map.remove(str);
	      
	        }
	        
	        
	        }
		
		
		
		
}
	
	
}
