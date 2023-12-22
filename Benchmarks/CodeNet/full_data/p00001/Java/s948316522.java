import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main{
    public static void main(String[] a){
    	Scanner scanner = new Scanner(System.in);
    	Integer[] data = new Integer[10];
    	for (int i = 0; i < 10; i++) {
    		int number = scanner.nextInt();
    		while (!(0 <= number && number <= 10000)) {
    			number = scanner.nextInt();
    		}
    		data[i] = number;
    	}
    	scanner.close();
    	Arrays.sort(data, Comparator.reverseOrder());
    	for (int i = 0; i < 3; i++) {
    		System.out.println(data[i]);
    	}

    }
}