import java.util.*;
 
class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);

    	int n = sc.nextInt();
    	int[] xList = new int[n];
    	int[] yList = new int[n];
    	for(int i = 0; i < n; i++) {
    		xList[i] = sc.nextInt();
    	}
    	for(int i = 0; i < n; i++) {
    		yList[i] = sc.nextInt();
    	}
    	double p1 = 0, p2 = 0, p3 = 0, pInf = 0;
    	for(int i = 0; i < n; i++) {
    		p1 += Math.abs(xList[i] - yList[i]);
    		p2 += Math.pow(Math.abs(xList[i] - yList[i]), 2);
    		p3 += Math.pow(Math.abs(xList[i] - yList[i]), 3);
    	}
    	pInf = Math.abs(xList[0] - yList[0]);
    	for(int i = 1; i < n; i++) {
    		pInf = Math.max(pInf, Math.abs(xList[i] - yList[i]));
    	}
    	System.out.println(p1);
    	System.out.println(Math.sqrt(p2));
    	System.out.println(Math.cbrt(p3));
    	System.out.println(pInf);
    }
}