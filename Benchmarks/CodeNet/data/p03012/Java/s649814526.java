import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int wsum[] = new int[n];
		wsum[0] = sc.nextInt();
		for(int i=1;i<n;i++) {
			wsum[i] = wsum[i-1]+sc.nextInt();
		}
		
		int sum = wsum[n-1];
		int min = sum;
		
		for(int i=0;i<n-1;i++) {
			if(min > zettaichi(sum - 2 * wsum[i]))
				min = zettaichi(sum - 2 * wsum[i]);
			else
				break;
		}
		
		System.out.print(min);
	}
	public static int zettaichi(int a) {
		if(a>=0)
			return a;
		else
			return -a;
	}
	
}