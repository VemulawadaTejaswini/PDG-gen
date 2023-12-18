import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int A = sc.nextInt(); //500
    	int B = sc.nextInt(); //100
    	int C = sc.nextInt(); //50
    	int X = sc.nextInt();
    	
    	int total_a;
    	int total_b;
    	int total_c;
    	
    	int ans = 0;
    	
    	for(int cntA = 0;cntA <= A;cntA++){
    		total_a = cntA * 500;
    		if(total_a > X){
    			break;
    		}
    		for(int cntB = 0;cntB <= B;cntB++){
    			total_b = cntB * 100;
    			if(total_a + total_b > X){
    				break;
    			}
    			for(int cntC = 0;cntC <= C;cntC++){
        			total_c = cntC * 50;
        			if(total_a + total_b + total_c == X){
        				++ans;
        			}
        			
        		}
    		}
    	}
    	System.out.println(ans);
    }
}

