import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		Set<String> hashSet = new HashSet<String>();
		int n = Integer.parseInt(reader.readLine());
		for (int i = 0; i < n; i++) {
			String[] cmd = reader.readLine().split(" ");
			if ('i' == cmd[0].charAt(0)) {
				hashSet.add(cmd[1]);
			} else {
				if (hashSet.contains(cmd[1])) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
			}
		}
	}
}
