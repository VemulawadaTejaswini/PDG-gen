import java.util.Scanner;
import java.util.*;
public class Main {
	
	
	
	public static long knapsack(int weight[], int value[], int mw) {
		return knapsack(weight,value,mw,0);
	}
	
	public static long knapsack(int weight[], int value[], int mw, int i) {
		if(i == weight.length || mw == 0) {
			return 0;
		}
		if(weight[i] > mw) {
			return knapsack(weight,value,mw,i+1);
		}else {
			long op1 = value[i] + knapsack(weight,value,mw-weight[i],i+1);
			long op2 = knapsack(weight,value,mw,i+1);
			return Math.max(op1, op2);
		}
	}
    
    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int mw = s.nextInt();
        int weight[] = new int[n];
        int value[] = new int[n];
        for(int i=0;i<n;i++) {
        	int wi = s.nextInt();
        	int vi = s.nextInt();
        	weight[i] = wi;
        	value[i] = vi;
        }
        System.out.println(knapsack(weight,value,mw));
    }
}