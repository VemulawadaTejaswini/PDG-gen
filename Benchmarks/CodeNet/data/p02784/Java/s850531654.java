import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
 
		    Scanner scanner = new Scanner(System.in);
		    
		    int H = scanner.nextInt();
		    int N = scanner.nextInt();
		    Integer i;
		    List<Integer> list = new ArrayList<Integer>();
		    for(i=1;i<N+1;i++){
		    	list.add(i,scanner.nextInt());
		    }
		     Collections.sort(list);
		    if(H<=list.get(i)+list.get(i-1)) {
		    	 System.out.println("true");
		    }
		    System.out.println("No");
		  }
}