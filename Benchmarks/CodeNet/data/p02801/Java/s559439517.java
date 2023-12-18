import java.util.Scanner;
public class Sample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String c = sc.next();
		
		char a = c.charAt(0);
		int b = (int)a;
		b++;
		a = (char)b;
		System.out.println(a);
	}

}
