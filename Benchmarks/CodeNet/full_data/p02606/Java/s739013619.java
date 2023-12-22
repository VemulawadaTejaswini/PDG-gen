import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     List<String> getParamsStr = Arrays.asList(sc.nextLine().split(" "));
	     Integer paramL = Integer.parseInt(getParamsStr.get(0));
	     Integer paramR = Integer.parseInt(getParamsStr.get(1));
	     Integer paramD = Integer.parseInt(getParamsStr.get(2));

	     int resultCount = 0;

	     for(Integer i = paramL; i <= paramR; i++) {
	    	 if(i % paramD == 0) {
	    		 resultCount++;
	    	 }

	     }
	     System.out.println(resultCount);
    }
}
