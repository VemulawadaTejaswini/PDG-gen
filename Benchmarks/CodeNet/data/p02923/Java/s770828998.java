import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i;
		int[] h = new int[n];
		for(i = 0; i < n; i++) {
			h[i] = scan.nextInt();
		}
		int sum = 0;
		int max = Integer.MIN_VALUE;
		for(i = 0; i < n - 1; i++) {
			if(h[i] >= h[i + 1]) {
				sum++;
			}else {
				if(sum > max) {
					max = sum;
				}
				sum = 0;
			}
		}
		if(sum > max)
			max = sum;
		System.out.println(max);
	}
}