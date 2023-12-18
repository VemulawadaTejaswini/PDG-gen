import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		int cnt = Integer.parseInt(in);

		String in2 = sc.nextLine();
		String [] inArray = in2.split(" ");
		List<String> list = new ArrayList<String>();
		list.add(inArray[0]);
		for (int i = 1; i < cnt; i++) {

			list.add(inArray[i]);
			list = reverse(list);
		}
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < list.size(); i++){
			buf.append(list.get(i) + " ");
		}
		System.out.println(buf.toString().trim());
		sc.close();
	}

	private static List reverse (List<String> list){

		List<String> wkList = new ArrayList<String>();
		for (int i = list.size() -1; i >= 0; i--){
			String a = list.get(i);
			wkList.add(a);
		}

		return wkList;
	}



}