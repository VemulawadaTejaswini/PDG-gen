import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[n];
        int[] c = new int[n];
		int x = Math.pow(n, 2);
        int max = 0;
      
        for (int i = 0; i < n; i++) {
          v[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
          c[i] = sc.nextInt();
        }
      
      	for (i = 0; i<x; i++) {
            int tempResultValue = 0;
            int tempResultCost = 0;
        	for(j = 0; j<n; j++){
          		if(isBitTrue(j,i)) {
                	tempResultValue+=v[j];
                    tempResultCost+=c[j];
                }
            }
        	
            if (max < (tempResultValue - tempResultCost)) {
            	max = (tempResultValue - tempResultCost);
            }
        }
      
      　System.out.println(max);
        sc.close();
    }
  
  public static boolean isBitTrue(int j, int i) {
    int mask = 0x1 << j;
  	return 0 != (mask & i);
  }
 
}