import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<String[]> list = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			String st = sc.next();
			String score = sc.next();
			String[] array = new String[3];
			array[0] = st;
			array[1] = score;
			array[2] = String.valueOf(i);
			list.add(array);
		}

		Collections.sort(
				list,
				new Comparator<String[]>() {
					@Override
					public int compare(String[] obj1, String[] obj2) {
						if(obj1[0].compareTo(obj2[0]) != 0) {
							return obj1[0].compareTo(obj2[0]);
						}else {
							return Integer.parseInt(obj2[1])-(Integer.parseInt(obj1[1]));
						}
					}
				});

		for(String[] st : list) {
			System.out.println(st[2]);
		}

	}

}
