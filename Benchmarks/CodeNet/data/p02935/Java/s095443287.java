import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	try {
    		final int N = sc.nextInt();
    		double[] array = new double[N];
    		for (int i=0; i<array.length; i++) {
    			array[i] = sc.nextDouble();
    		}
    		Arrays.sort(array);

    		double initial = (array[0] + array[1]) / 2;
    		for (int i=2; i<array.length; i++) {
    			initial = (initial + array[i]) / 2;
    		}
    		System.out.println(initial);

    	} finally {
    		sc.close();
    	}
    }
}

