import java.util.Scanner;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		ArrayList<Integer> aa = new ArrayList<Integer>();
      int n = sc.nextInt();
      for(int i=0;i<n; i++) {
    	int k = sc.nextInt();
    	  if(aa.contains(k)!=true) {
    		aa.add(k);}
    		else if(aa.contains(k)) {
        	aa.remove(aa.indexOf(k));}  
     
      }
      sc.close();
    	System.out.println(aa.size());
	}

}
