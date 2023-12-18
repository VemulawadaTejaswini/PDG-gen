import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String w = scan.nextLine();
		int nagasa = w.length();
		int i = 0;
		String no = "No";

		List<String> list = new ArrayList<String>();

		for (i = 0; i < nagasa; i++) {
			list.add(w.charAt(i) + "");
		}

		for (; 0 != list.size();) {

			List<String> set = new ArrayList<>();
			Collections.addAll(set, list.get(0));

			list.removeAll(set);

			int te = nagasa - list.size();

			if (te % 2 != 0) {

				break;


			}

			if(list.size()==0) {
				no="Yes";
			}

		}

		System.out.println(no);


	}

}