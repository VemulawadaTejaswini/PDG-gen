import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();

for(int i=a;i<=b;i++) {
 if(i%k == 0) {
	 System.out.println("YES");
	 return;
 }
}

	 System.out.println("NO");

	}
}
