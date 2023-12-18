
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static int sum(int a[]){
		int sum = 0;
		for(int i = 0; i < a.length; i++)
			sum += a[i];
		
		return sum;
	}
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		
		int a[] = new int[n], b[] = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		
		int bigArray[] = new int[sum(b)];
		int bigIndex = 0;
		for(int i = 0; i < n; i++)
			for(int j = 0; j < b[i]; j++)
				bigArray[bigIndex++] = a[i];
		
		Arrays.sort(bigArray);
		
		System.out.println(bigArray[3]);
		
	}
 
}