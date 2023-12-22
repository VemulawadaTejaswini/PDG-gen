import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int n = sc.nextInt();
		int[] data = new int[n];
    	for (int i = 0; i < n; i++) {
    		data[i] = sc.nextInt();
    	}
    	
    	for (int i = 1; i < n; i++) {
    		printData(data);

    		int key = data[i];
    		int j = i - 1;
    		for (; j >= 0 && data[j] > key; j--) {
    			data[j + 1] = data[j];
    		}
    		data[j + 1] = key;
    		
    	}
		
    	printData(data);
    	
        sc.close();
	}

	private static void printData(int[] data) {
		StringBuffer printData = new StringBuffer();
		for (int i = 0; i < data.length; i++) {
			printData.append(data[i]);
			printData.append(" ");
		}
		printData.delete(printData.length() - 1, printData.length());
		System.out.println(printData);
	}
}