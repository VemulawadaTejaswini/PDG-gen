import java. util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		String s = String.valueOf(n);

		char[] c = s.toCharArray();

		if(n<10) {
			if(c[0]=='3') {
				System.out.println("bon");
			}else if(c[0]=='0'||c[0]=='1'||c[0]=='6'||c[0]=='8') {
				System.out.println("pon");
			}else {
				System.out.println("hon");
			}
		}else if(10<n&&n<100) {
			if(c[1]=='3') {
				System.out.println("bon");
			}else if(c[1]=='0'||c[1]=='1'||c[1]=='6'||c[1]=='8') {
				System.out.println("pon");
			}else {
				System.out.println("hon");
			}
		}else {
			if(c[2]=='3') {
				System.out.println("bon");
			}else if(c[2]=='0'||c[2]=='1'||c[2]=='6'||c[2]=='8') {
				System.out.println("pon");
			}else {
				System.out.println("hon");
			}
		}

	}

}
