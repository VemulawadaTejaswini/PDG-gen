import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		
		if(k%2==0) {
			System.out.println(-1);
			System.exit(0);
		}
		
		int ans=0;
		long mod=7;
		
		while(true) {
			ans++;
			if(mod==0) break;
			mod=(mod*10+7)%k;
		}
		System.out.println(ans);
	}
}