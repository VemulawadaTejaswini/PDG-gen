import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
    	try(Scanner sc = new Scanner(System.in)) {

    		while(true) {
    			int n = sc.nextInt();
    			if(n == 0) break;
    			double[] a = new double[n];
    			double sum = 0;
    			for(int i=0; i<n; i++) {
    				a[i] = sc.nextDouble();
    				sum += a[i];
    			}
    			sum = sum / n;
    			int count = 0;
    			for(int i=0; i<n; i++) {
    				if(a[i] <= sum)	count++;
    			}
    			System.out.println(count);
    		}

    	}
    }
}


