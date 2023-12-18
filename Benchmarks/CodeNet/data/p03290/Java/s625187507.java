
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N =in.nextInt();
		int G =in.nextInt();
		int[] p = new int[N];
		int[] c = new int[N];
		for (int i = 0; i < N; i++) {
			p[i] = in.nextInt();
			c[i] = in.nextInt();
		}
		int min=1000000;
		int sum=0;
		int count=0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<p[i];j++) {
				sum+=(i+1)*100;
				count++;
				if(sum>=G&&count<=min) {
					min=count;
				}
			}
			sum+=c[i];
			if(sum>=G&&count<=min) {
				min=count;
			}
		}
		
		count=0;
		sum=0;
		
		for(int i=N-1;i>=0;i--) {
			for(int j=0;j<p[i];j++) {
				sum+=(i+1)*100;
				count++;
				if(sum>=G&&count<=min) {
					min=count;
				}
			}
			sum+=c[i];
			if(sum>=G&&count<=min) {
				min=count;
			}
		}		
		
		System.out.print(min);
		
		
	}
}
