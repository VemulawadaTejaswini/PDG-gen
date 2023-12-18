

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author sutoh
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int a,b,c;


		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();

		List<Integer> list=new ArrayList<Integer>();

		list.add(a);
		list.add(b);
		list.add(c);

		Collections.sort(list);

		System.out.println(list.get(0)+list.get(1));


	}

}
