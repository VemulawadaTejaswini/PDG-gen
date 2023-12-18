import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		  Scanner sc = new Scanner(System.in);
		  String s = sc.nextLine();
		  int K = sc.nextInt();
		  sc.close();
		  
		  List<String> list = new ArrayList<>();
	
		  for(int i = 1; i <= s.length(); i++) {
			  for(int j = 0; j < s.length() + 1 - i; j++) {
				  if(!list.contains(s.substring(j, j + i))) {
					  list.add(s.substring(j, j + i));
				  }
			  }
		  }
		  
		  Collections.sort(list);
		  
		  System.out.println(list.get(K - 1));
	      System.exit(0);
	    }
}