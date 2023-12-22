import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int n = sc.nextInt();
		int[] data = new int[n];

    	for (int i = 0; i < n; i++) {
    		data[i] = sc.nextInt();
    	}

    	// i以降の最大値を保持
    	int[] dataMax = new int[n];
    	for (int i = n - 1; i >= 0; i--) {
    		if (i == n - 1) {
    			dataMax[i] = data[i];
    		} else {
    			dataMax[i] = Math.max(dataMax[i + 1], data[i]);
    		}
    	}

    	int max_profit = data[1] - data[0];
    	for (int i = 0; i < n - 1; i++) {
//    		if (i == 0 || data[i - 1] > data[i]) {
    			max_profit = Math.max(max_profit, dataMax[i + 1] - data[i]);
//    		}
    	}
		
    	System.out.println(max_profit);
    	
        sc.close();
	}
}