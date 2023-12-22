import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int n = sc.nextInt();
		int[] data = new int[n];

    	for (int i = 0; i < n; i++) {
    		data[i] = sc.nextInt();
    	}

		int max_profit = data[1] - data[0];
    	for (int i = 0; i < n; i++) {
    		for (int j = i + 1; j < n; j++) {
    			max_profit = Math.max(max_profit, data[j] - data[i]);
    		}
    	}
		
    	System.out.println(max_profit);
    	
        sc.close();
	}
}