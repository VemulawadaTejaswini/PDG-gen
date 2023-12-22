import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		while (str!=null) {
			List<Integer> stack = new ArrayList<>();
			int top = 0;
			String[] data = str.split(" ", 0);
			for (int i = 0; i < data.length; i++) {
				if (data[i].equals("+")) {
					int x = stack.get(top - 1);
					top--;
					int y = stack.get(top - 1);
					top--;
					stack.add(top, x + y);
					top++;
				} else if (data[i].equals("-")) {
					int x = stack.get(top - 1);
					top--;
					int y = stack.get(top - 1);
					top--;
					stack.add(top, y - x);
					top++;
				} else if (data[i].equals("*")) {
					int x = stack.get(top - 1);
					top--;
					int y = stack.get(top - 1);
					top--;
					stack.add(top, x * y);
					top++;
				} else {
					stack.add(top, Integer.parseInt(data[i]));
					top++;
				}
			}
			System.out.println(stack.get(top - 1));
			str = br.readLine();
		}
	}
}