import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();		//n個の整数
		int count=0;
		
		for(int i=0;i<n;i++) {		//n個回す
			int a=sc.nextInt();
			count+=a;
			}
		
		if(count%2==0) {	//偶数で割れるか
			if(count%3==0||count%5==0) {	//3または5で割り切れるかどうか
				System.out.println("APPROVED");
			}else {
				System.out.println("DENIED");
			}
		}
		sc.close();
	}
	
}