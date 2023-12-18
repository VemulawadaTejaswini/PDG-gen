import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
	static int m;
	static int n;
	static long [] map;
	static List list;
	    public static void main(String[]args){
	        Scanner scan = new Scanner (System.in);
	        n = scan.nextInt();
	        m = scan.nextInt();
	        map = new long [n+1];
	        list = new ArrayList();
	        for(int i = 0;i < n+1;i++) {
	        	map[i] = -1;
	        }
	        if(m == 0) {
	        	list.add(-1);
	        }else {
	        	for(int i = 0; i < m;i++) {
	        		list.add(scan.nextInt());
	        	}
	        }
	        Long ans = downSteps(n);
	        System.out.println(ans%1000000007);
	}
	    public static long downSteps (int Step) {
	    	if(map[Step] > -1) {
	    		return map[Step];
	    	}
	    	boolean nextStepExistence = true;
	    	boolean twoDownStepExistence = true;
	    	int nextStep = Step-1;
	    	int twoDownStep = Step-2;
	    	long pattern = 1;
	   		if(nextStep < 0||list.contains(nextStep)) {
	   			nextStepExistence = false;
	   		}
	   		if(twoDownStep < 0 || list.contains(twoDownStep)) {
	    		twoDownStepExistence = false;
	    	}
	    	if(nextStepExistence) {
	    		pattern = downSteps(nextStep);
	    	}
	    	if(twoDownStepExistence) {
	    		if(nextStepExistence) {
	    			pattern += downSteps(twoDownStep);
	    		}else {
	    			pattern = downSteps(twoDownStep);
	    		}
	    	}
	    	if(!twoDownStepExistence&&!nextStepExistence&&Step != 0) {
	    		pattern = 0;
	    	}
	    	pattern = pattern % 1000000007;
	    	map[Step] = pattern;
	    	return pattern;
	    }
}

