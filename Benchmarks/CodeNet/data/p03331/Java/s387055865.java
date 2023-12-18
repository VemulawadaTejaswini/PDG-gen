import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int ans=0;
		if(Math.log10(n)%1==0) {
			ans=10;
		}
		else {
			while(n>0) {
				ans+=n%10;
				n=n/10;
			}
		}
		System.out.println(ans);
		
	}
	

}


