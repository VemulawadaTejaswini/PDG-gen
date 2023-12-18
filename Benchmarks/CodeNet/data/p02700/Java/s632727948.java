import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc=new Scanner(System.in);
		//高橋君の体力
		int A=sc.nextInt();
		//高橋君の攻撃力
		int B=sc.nextInt();
		//青木君の体力
		int C=sc.nextInt();
		//青木くんの攻撃力
		int D=sc.nextInt();
		
		
		while(C>0&&A>0) {
			if(C>0) {
				C=C-B;
			}
			if(C<0) {
				if(A>0) {
					A=A-D;
			}
				}
		}
		
		if(C<=0) {
			System.out.println("Yes");
		}
		
		if(A<=0) {
			System.out.println("No");
		}
	}
}
