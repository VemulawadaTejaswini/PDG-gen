import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner vd = new Scanner(System.in);
		String[] a=vd.nextLine().split("");
		String[] b=vd.nextLine().split("");
		vd.close();
		if(a[0]==b[2]&&a[1]==b[1]&&a[2]==b[0]) System.out.println("Yes");
		else System.out.println("No");

	}

}
