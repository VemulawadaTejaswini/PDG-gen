import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
 int c = a%k;
 int d = a+k-c;

 if(d <= b || c == 0) {
	 System.out.println("YES");
 }else {
	 System.out.println("NO");
 }
	}
}
