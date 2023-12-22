import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		HashMap<String, Boolean> map = new HashMap<String, Boolean>();
		
		for (int i = 0; i < n; i++) {
			String line = sc.nextLine();
			String cmd = line.split(" ")[0];
			String str = line.split(" ")[1];
			
			if (cmd.equals("insert")) {
				map.put(str, new Boolean(true));
			} else if (cmd.equals("find")) {
				if(map.containsKey(str) && map.get(str)) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
			}
		}
	}
}