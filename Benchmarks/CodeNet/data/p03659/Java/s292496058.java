import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long sum = 0;
		long[][] a = new long[n][2];
		
		for(int i=0; i<n; i++){
			a[i][0] = sc.nextLong();
			sum += a[i][0];
			a[i][1] = sum;
		}
		
		long min = a[0][0];
		if(n != 2){
			for(int i=1; i<n-1; i++){
				if (Math.abs(sum-2*a[i][1]) < min){
					min = Math.abs(sum-2*a[i][1]);
				}
			}			
		}
		else{
			min = Math.abs(a[0][0]-a[1][0]);
		}
		
		System.out.println(min);
		
		sc.close();
	}
}