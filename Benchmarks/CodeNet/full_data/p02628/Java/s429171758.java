import java.util.Arrays;
import java.util.Scanner;

public class ques {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		
		int a[] = new int[n];
		for(int i=0;i<n;i++)
			a[i] = s.nextInt();
		
		Arrays.parallelSort(a);
		int sum = 0;
		for(int i=0;i<k;i++)
			sum+=a[i];
		System.out.println(sum);
	}

}
