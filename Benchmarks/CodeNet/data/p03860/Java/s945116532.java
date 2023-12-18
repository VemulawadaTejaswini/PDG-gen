import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		System.out.println("コンテスト名を入力してください。");
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		String[] resultArray = str.split(" ");
		
		String a = resultArray[0].substring(0,1);
		String b = resultArray[1].substring(0,1);
		String c = resultArray[2].substring(0,1);
		
		System.out.println(a + b + c);
	}

}
