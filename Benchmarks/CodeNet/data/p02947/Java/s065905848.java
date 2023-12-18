import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long a = s.nextInt();
		s.nextLine();
		Hashtable<String, Long> map = new Hashtable<>();
		long count = 0;
		for (int i = 0; i < a; i++) {
			String string = sort(s.nextLine());
			if(!map.containsKey(string)) {
				map.put(string, 1L);
			}else {
				count+=map.get(string);
				map.put(string, map.get(string)+1);
			}
		}
		System.out.println(count);

	}
	public static String sort(String x) {
		char[] sar =x.toCharArray();
		Arrays.sort(sar);
		return new String(sar);
	}

}
