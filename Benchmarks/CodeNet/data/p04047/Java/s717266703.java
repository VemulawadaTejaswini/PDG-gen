import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] l = new int[n*2];
		
		for(int i=0; i<n*2; i++) {
			l[i] = sc.nextInt();
		}
		System.out.println(test(n, l));
		
		sc.close();

	}
	
	public static int test(int n, int[] l) {
		Arrays.sort(l);
		int sum = 0;
		for(int i=0; i<n*2; i+=2) {
			sum += l[i];
		}
		return sum;
	}

}
