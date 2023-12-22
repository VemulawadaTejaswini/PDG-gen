
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= 30; i++)
			list.add(i);
		for (int i = 0; i < 28; i++)
			list.remove(Integer.valueOf(scanner.next()));
		for (int ans : list)
			System.out.println(ans);
	}
}