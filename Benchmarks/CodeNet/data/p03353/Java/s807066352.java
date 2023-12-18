import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner sn = new Scanner(System.in)) {
			String s = sn.next();
			int k = sn.nextInt();

			String[] ss = s.split("");
			ArrayList<String> al = new ArrayList<String>();

			//StringBuilder sb = null;
			String tmp = null;
			for (int i = 0; i < ss.length; i++) {
				//sb = new StringBuilder();
				tmp = null;
				for (int j = i; j < ss.length; j++) {
					//sb.append(ss[j]);
					//tmp = sb.toString();
					tmp += ss[j];
					//if (sb.length() != 0 && !al.contains(tmp)) {
					if (tmp.length() != 0 && !al.contains(tmp)) {
						al.add(tmp);
					}
				}

			}
			String[] result = al.toArray(new String[0]);
			Arrays.sort(result, new Comp());
			System.out.println(result[k-1]);
		}
	}
}

class Comp implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = (String)o1;
		String s2 = (String)o2;
		return s1.compareTo(s2);
	}

}
