import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner cd = new Scanner(System.in);
		long d = cd.nextInt();
		long n = cd.nextInt();
		long ans=0;
		if(d==0) ans=n;
		else if(d==1) ans=100*n;
		else if(d==2) ans= 10000*n;
		
		System.out.println(ans);
	}

}
