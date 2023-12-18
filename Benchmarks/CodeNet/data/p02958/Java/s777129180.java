import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		 Scanner scan = new Scanner(System.in);
	     int r  = scan.nextInt();
	     ArrayList<Integer> list = new ArrayList<Integer>();
	     for(int i=0;i<r;i++) {
	    	 list.add(scan.nextInt());
	     }

	     @SuppressWarnings("unchecked")
		ArrayList<Integer> sorted =(ArrayList<Integer>) list.clone();
	     Collections.sort(sorted);
	     for(int i=0;i<list.size()-1;i++) {
	    	 for(int j=i+1;j<list.size();j++) {
	    		 @SuppressWarnings("unchecked")
				ArrayList<Integer> tmp =(ArrayList<Integer>) list.clone();
	    		 tmp.set(i, list.get(j));
	    		 tmp.set(j, list.get(i));
	    		 if(sorted.equals(tmp) || sorted.equals(list)) {
	    			 System.out.println("YES");
	    			 return ;
	    		 }

	    	 }

	     }
		 System.out.println("NO");
	}

}
