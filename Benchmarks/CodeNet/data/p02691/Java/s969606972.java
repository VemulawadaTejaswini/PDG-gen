import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] count_right = new long[n], count_left = new long[n];
		for(int i=0;i<n;i++) {
			int temp = sc.nextInt();
			if(i-temp>=0) count_left[i-temp]++;
			if(i+temp<n) count_right[i+temp]++;
		}
		sc.close();
		long ans=0;
		for(int i=0;i<n;i++) ans += count_left[i]*count_right[i];
		System.out.println(ans);
	}
}