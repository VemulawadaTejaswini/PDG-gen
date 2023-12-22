import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int ans=0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int hako[] = new int[n];
		for(int i=0;i<n;i++) {
			hako[i] = sc.nextInt();
		}
		int ans_A=1;
		int hokan_A = hako[0];
		for(int i=1;i<n;i++) {
			if(Math.abs(hokan_A-hako[i])<=m) {
				hokan_A=hako[i];
				ans_A++;
			}
		}
		
		int ans_B=1;
		int hokan_B = hako[n-1];
		for(int i=2;i<n;i++) {
			if(Math.abs(hokan_B-hako[n-i])<=m) {
				hokan_B=hako[n-i];
				ans_B++;
			}
		}
		if(ans_A>ans_B) {
			System.out.println(ans_A);
		}
		else{
			System.out.println(ans_B);
		}
	}
}
