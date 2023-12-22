import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
      	List<Integer> list = new ArrayList<>();
      	while(sc.hasNextLine()) {
      	    try {
        	    int a = sc.nextInt();
          	    list.add(a);
      	    } catch (NoSuchElementException e) {
      	        
      	    }     
        } 	
		
      	for (int i = 0; i < list.size(); i++) {
        	if(list.get(i) == 0) {
            	break;
            }
          	System.out.println("Case " + (i + 1) + ": " + list.get(i));
        }
	}
}
