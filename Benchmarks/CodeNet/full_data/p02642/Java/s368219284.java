
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] p = new int[n];
		int count=0;
		int sum=0;
		
		for(int i=0;i<n;i++) {
			p[i]=sc.nextInt();
		}
		
		Arrays.sort(p);
		
		for(int i=0;i<n;i++) {
			count=0;
			for(int j=0;j<n;j++) {
				if(p[i]%p[j]==0&&i!=j) {
					break;
				}
				count++;
			}
			if(count==n) {
				sum++;
			}
		}
		System.out.println(sum);
		sc.close();
	}
}