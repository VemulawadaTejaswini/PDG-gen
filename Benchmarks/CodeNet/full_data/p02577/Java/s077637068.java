import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		String s = scan.next();

		char[] a = s.toCharArray();
		int total = 0;

		for(int i=0;i<a.length;i++) {
			total += Character.getNumericValue(a[i]);
		}

		if(total%9==0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
