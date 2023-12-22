import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int a=Integer.parseInt(scan.next());
		int b=Integer.parseInt(scan.next());
		System.out.print("a");
		if(a<b)System.out.println(" < b");
		else if(a>b)System.out.println(" > b");
		else System.out.println(" == b");
	}
}