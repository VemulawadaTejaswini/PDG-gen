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
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
//		int b=scanner.nextInt();

		if(a/1000==0) {
			System.out.println(0);
		}else {
			System.out.println(1000-a%1000);
		}

		}


	}



