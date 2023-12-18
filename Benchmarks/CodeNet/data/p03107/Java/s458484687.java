import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	static int res = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		List<Integer> list = new ArrayList<Integer>();

		for(int i = 0; i < s.length(); i++) {
			list.add(Integer.parseInt(String.valueOf(s.charAt(i))));
		}
		
		a(list);
		
		System.out.println(res);
	}

	public static void a(List<Integer> list) {
		int lastInt = 2;

		for(int i : list) {
			if(lastInt != 2) {
				if(i != lastInt) {
					int index = list.indexOf(i) - 1;
					list.remove(index);
					list.remove(index);
					res+=2;
					a(list);
					return;
				}
			}
			lastInt = i;
		}
	}
}