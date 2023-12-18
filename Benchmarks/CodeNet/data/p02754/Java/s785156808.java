import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();		//N個のボール
		int a=sc.nextInt();		//青いボール
		int b=sc.nextInt();		//赤いボール
		
		long sum=n/(a+b)*a;
		long result=n%(a+b);
		
		if(result>=sum) {
			sum+=a;
		}else {
			sum+=result;
		}
		System.out.println(sum);
		sc.close();
	}
}