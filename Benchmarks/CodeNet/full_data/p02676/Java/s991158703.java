import java. util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		int k = scan.nextInt();
		String s = scan.next();

		char[] c = s.toCharArray();

		if(c.length<=k) {
			System.out.println(s);
		}else {
			for(int i=0;i<k;i++) {
				System.out.print(c[i]);
			}
			System.out.println("...");
		}



	}

}
