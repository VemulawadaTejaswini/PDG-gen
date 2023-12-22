import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> cases = new ArrayList<Integer>();
		int count = 0;
		String line;
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			while (true) {
				line = buf.readLine();
				cases.add(Integer.parseInt(line));
				if (cases.get(count) == 0)
					break;
				count++;
			}
			for (int i = 0; i < cases.size(); i++) {
				if (cases.get(i) == 0)
					break;
				System.out.println("Case " + (i + 1) + ": " + cases.get(i));
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}