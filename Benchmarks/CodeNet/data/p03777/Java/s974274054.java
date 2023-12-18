import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();

		if (a.equals("H")){
			System.out.println(b);
		}else{
			if(b.equals("H")){
				System.out.println("D");
			}else{
				System.out.println("H");
			}
		}
	}

}
