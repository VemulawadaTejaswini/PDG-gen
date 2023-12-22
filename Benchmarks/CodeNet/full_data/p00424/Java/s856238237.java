import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = Integer.parseInt(sc.nextLine());
		while (0 < times) {
			loop_1(sc, times);
			System.out.println("");
			times = Integer.parseInt(sc.nextLine());
		}	
	}
	
	private static void loop_1(Scanner sc, int times) {
		Map<String, String> map = new HashMap<String, String>();
		for (int i = 0; i < times; i++) {
			String[] line = sc.nextLine().split(" ");
			map.put(line[0], line[1]);
		}
		loop_2(sc, map);
	}
	
	private static void loop_2(Scanner sc, Map<String, String> map) {
		int times = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < times; i++) {	
			String str = sc.nextLine();
			String conStr = (String) map.get(str);
			if (conStr == null) {
				System.out.print(str);
			} else {
				System.out.print(conStr);
			}
		}
	}
}