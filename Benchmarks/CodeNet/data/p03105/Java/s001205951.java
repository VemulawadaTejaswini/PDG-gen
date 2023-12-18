import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		int L=0;
		while(L<C) {
			B=B-A;
			if(B>=0) {
				L++;
			}
			else {
				break;
			}
		}
		System.out.println(L);
	}
}