import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());

		List<Integer> list = new ArrayList<>();

		int count = 0;

		for (int i = 0; i < n; i++) {
			int height = Integer.parseInt(sc.next());

			if (list.stream().allMatch(h -> height >= h)) {
				count++;
			}

			list.add(height);
		}

		System.out.println(count);
		sc.close();
	}
}