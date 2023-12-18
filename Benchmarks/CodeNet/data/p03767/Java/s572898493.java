import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	Integer []a = new Integer [3*n];
	
	for(int i = 0; i < 3*n; i++)
		a[i] = sc.nextInt();
	
	Arrays.sort(a,Collections.reverseOrder());
	
	long sum = 0;
	
	for(int i = 1; i <= n; i++) {
		sum += a[(2 * i) - 1];
	}
	System.out.println(sum);
	
	}

}
