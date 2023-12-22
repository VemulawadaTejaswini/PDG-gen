import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

        for (int n = sc.nextInt(); n != 0; n = sc.nextInt()) {
        	int[] data = new int[n];
        	int sum = 0;
        	for (int i = 0; i < n; i++) {
        		data[i] = sc.nextInt();
        		sum += data[i];
        	}
        	double average = (double)sum / n;

        	double sd = 0.0;
        	for (int i = 0; i < n; i++) {
        		sd += Math.pow(data[i] - average, 2);
        	}
        	sd /= n;

        	System.out.println(String.format("%.4f", Math.sqrt(sd)));
        }
         
        sc.close();
	}
}