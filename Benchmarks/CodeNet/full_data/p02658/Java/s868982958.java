import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();  	//入力数
		long A[]=new long [n];
		
		for(int i=0;i<n;i++) {
			A[i]=scan.nextLong();
		}
		long ans=A[0];
		for(int i=1;i<n;i++) {
			ans=A[i]*ans;
		}
		;
		if(ans>1000000000000000000l) {
			System.out.println("-1");
		}else {
		System.out.println(ans);
		}
	}

}
