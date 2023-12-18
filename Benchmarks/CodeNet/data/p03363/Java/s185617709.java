import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int hako[] = new int[n+1];
		hako[0] = 0;
		int ans=0;
		
		for(int i=1;i<=n;i++) {
			hako[i] += hako[i-1]+sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n+1;j++) {
				if(hako[i]==hako[j]) {
					ans++;
				}
			}
		}
		
		System.out.println(ans);
		
	}
}
