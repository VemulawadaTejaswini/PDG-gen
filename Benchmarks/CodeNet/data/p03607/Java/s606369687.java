
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		ArrayList<Integer> aa = new ArrayList<Integer>();
      int n = sc.nextInt();
      for(int i=0;i<n; i++) {
    	int k =sc.nextInt();
    	   aa.add(k);
      }
      sc.close();
      
      for(int i=0;i<n; i++) {
    	 int l =aa.get(i);
    	 aa.remove(aa.get(i)); 
    		if(aa.contains(l)!=true)  {aa.add(l);
    		}
    		else{aa.remove(aa.indexOf(l));}
    	  
    		
     
      }
      
    	System.out.println(aa.size());
	}

}