import java.util.Scanner;
public class Main {
	static int m;
	static int n;
	static int[] a;
	static long [] map;
	    public static void main(String[]args){
	        Scanner scan = new Scanner (System.in);
	        n = scan.nextInt();
	        m = scan.nextInt();
	        map = new long [n+1];
	        for(int i = 0;i < n+1;i++) {
	        	map[i] = -1;
	        }
	        if(m == 0) {
	        	a = new int[1];
	        	a[0] = -1;
	        }else {
	        	a = new int[m];
	        	for(int i = 0; i < m;i++) {
	        		a[i] = scan.nextInt();
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
	    	for(int i = 0; i < a.length;i++) {
	    		if(nextStep < 0||a[i] == nextStep || !nextStepExistence) {
	    			nextStepExistence = false;
	    		}
	    		if(twoDownStep < 0 || a[i] == twoDownStep || !twoDownStepExistence) {
	    			twoDownStepExistence = false;
	    		}
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
