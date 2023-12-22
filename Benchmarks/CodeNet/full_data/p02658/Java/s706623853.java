import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan =new Scanner(System.in);
		long N=scan.nextLong();
		long sum=1;
		int b=18;
		long bmax=1;
		for(int i=0;i<N;i++) {
			long a=scan.nextLong();
			sum*=a;
		}
	
		for(int i=0;i<b;i++) {
			bmax*=10;
		}
		if(sum<=bmax) {
			System.out.println(sum);
		}else {
			System.out.println("-1");
		}
		}
}
