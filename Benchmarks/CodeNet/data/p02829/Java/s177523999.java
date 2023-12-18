import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int a=Integer.parseInt(sc.next());
		if(n==1) {
			if(a==2) {
				System.out.println(3);
			}
			else {
				System.out.println(2);
			}
		}
		else if(n==2) {
			if(a==1) {
				System.out.println(3);
			}
			else {
				System.out.println(1);
			}
		}
		else if(n==3) {
			if(a==1) {
				System.out.println(2);
			}
			else {
				System.out.println(1);
			}
		}
	}
}