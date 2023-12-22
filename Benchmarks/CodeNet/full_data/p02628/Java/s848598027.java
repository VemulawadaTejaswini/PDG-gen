
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	int N = Integer.parseInt(scanner.next());
    	int K = Integer.parseInt(scanner.next());
    	int[] fruits = new int[N];
    	for(int i=0;i<N;i++) {
    		fruits[i] = Integer.parseInt(scanner.next());
    	}
    	int sum = 0;
    	Arrays.sort(fruits);
    	for(int i=0;i<K;i++) {
    		sum += fruits[i];
    	}
    	System.out.println(sum);
    	scanner.close();
    }
}