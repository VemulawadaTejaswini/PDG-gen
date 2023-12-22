import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan=new Scanner(System.in);
		String n=scan.next();
		String oomoji=n.toUpperCase();
		String komoji=n.toLowerCase();
		if(n==oomoji) {
			System.out.println("A");
		}else {
			System.out.println("a");
		}
	}

}
