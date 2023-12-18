import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, a[];
		long count = 0, sum = 0, presum;
		
		n = sc.nextInt();
		a = new int[n];
		
		for(int i = 0; i < n; ++i)a[i] = sc.nextInt();
		
		sc.close();
		
		presum = -a[0];
		
		for(int i: a) {
			sum += (long)i;
			while(sum * presum > 0) {
				if(presum > 0) sum--;
				else sum++;
				++count;
			}
			
			if(sum == 0) {
				if(presum > 0)sum--;
				else sum++;
				++count;
			}
			
			presum = sum;
		}
		
		System.out.println(count);
		
	}

}
