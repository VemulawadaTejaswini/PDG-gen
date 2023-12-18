import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String[] NK = scan.nextLine().split(" ");
		String[] tmp;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < Integer.parseInt(NK[0]); i++){
			tmp = scan.nextLine().split(" ");
			for(int j = 0; j < Integer.parseInt(tmp[1]);j++){
				list.add(Integer.parseInt(tmp[0]));
			}
		}
		Collections.sort(list);
		System.out.println(list.get(Integer.parseInt(NK[1])-1));
	}
}
