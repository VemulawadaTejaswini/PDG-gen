import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main { 

	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int inputNumber = Integer.parseInt(sc.nextLine());
    	String[] lineNumber = sc.nextLine().split(" ");
    	List<Long> allNumber = new ArrayList();
    	for(int i = 0;i<lineNumber.length;i++) {
    		allNumber.add(Long.parseLong(lineNumber[i]));
    	}
    	
    	long preNumber = allNumber.get(0);
    	long canMove = 0;
    	List<Long> resultList = new ArrayList();
    	for(int i = 1;i<allNumber.size();i++) {
    		
    		long tmp = allNumber.get(i);
    		if(preNumber >= tmp) {
    			canMove++;
    		}else {
    			canMove = 0;
    		}
    		
    		
    		resultList.add(canMove);
    		preNumber = tmp;
    	}
    		
    	
    	System.out.println(Collections.max(resultList));
    }
}