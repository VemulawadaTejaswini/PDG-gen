import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner in = new Scanner(file);
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int[] a = new int[n];
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			a[i] = in.nextInt();
            sum += a[i];
		}
        int min = sum;
		
		for(int i = 0; i < n; i++) {
			sum -= 2 * a[i];
            if(Math.abs(sum) < min) min = Math.abs(sum);
		}
		System.out.println(min);
	}
}
