
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int hako[] = new int[n];
		int hokan = 0;
		double sum=0;
		int mod = 1000000007;

		for(int i=0;i<n;i++) {
			hako[i]=sc.nextInt();
		}

		for(int i=0;i<n-1;i++) {
			hokan += hako[i];
			sum += hokan*hako[i+1] %mod;
		}
		System.out.println((int)sum);
	}
}

