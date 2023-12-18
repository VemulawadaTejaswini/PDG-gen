import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main { 

	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String inputNumber = sc.nextLine();
    	String[] lineNumber = sc.nextLine().split(" ");
    	List<Integer> allNumber = new ArrayList();
    	for(int i = 0;i<lineNumber.length;i++) {
    		allNumber.add(Integer.parseInt(lineNumber[i]));
    	}
    	
    	List<Integer> resultList = new ArrayList();
    	int preNumber = allNumber.get(0);
    	int count = 0;
    	
    	for(int i = 1;i<allNumber.size();i++) {
    		if(preNumber >= allNumber.get(i)) {
    			count++;
    		}else {
    			resultList.add(count);
    			count = 0;
    		}
    		if(i == allNumber.size()) {
    			resultList.add(count);
    		}
    	}
    	
    	Collections.sort(resultList,Collections.reverseOrder());
    	
    	System.out.println(resultList.get(0));
    }
}