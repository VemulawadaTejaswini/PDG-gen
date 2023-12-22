import java.util.Scanner;

/**
 *
 */

/**
 * @author bluen
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
//		int b=scanner.nextInt();
		if(N%1000!=0) {
			System.out.println(1000-N%1000);

		}else {
			System.out.println(0);
		}


	}

}
