import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		
		String a=sc.next();
		String ABC="ABC";
		String ARC="ARC";

		if(a.equals("ABC")) {
			System.out.println("ARC");
		}else if(a.equals("ARC")) {
			System.out.println("ABC");
		}
		sc.close();
	}

}