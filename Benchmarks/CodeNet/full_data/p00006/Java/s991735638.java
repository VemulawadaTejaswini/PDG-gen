import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		Scanner scan = new Scanner(System.in);
		char[] mozi = scan.next().toCharArray();
		for(int i=mozi.length-1;i>=0;i--){
			System.out.print(mozi[i]);
		}
		System.out.println();
	}

}