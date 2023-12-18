import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();	
		int x=sc.nextInt();	
		
		int sum = 0;
		int ans = 0;
		
		for(int i=0;i<n;i++) {
			int l=sc.nextInt();
			sum+=l;
			if(sum<=x) {
				ans++;
			}
		}
		System.out.println(ans+1);
		sc.close();
	}
}
