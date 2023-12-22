import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(System.in);
		// Scanner scan = new Scanner(new File("c:\\0515-input.txt"));
		while (true) {
			int n = scan.nextInt();
			int k = scan.nextInt();
			if (n == 0 & k == 0)
				break;

			boolean[] e = new boolean[n + 1];

			for (int i = 0; i < k; i++)
				e[scan.nextInt()] = true;

			List<Integer> contig = new ArrayList<Integer>();

			for (int i = 1; i <= n;) {
				int j = 1;
				for (; i + j <= n; j++)
					if (e[i + j] != e[i])
						break;
				if (e[i])
					contig.add(j);
				else
					contig.add(-1 * j);
				i += j;
			}

			int max = 0;
			for (int i = 0; i < contig.size(); i++)
				if (max < contig.get(i))
					max = contig.get(i);

			if (e[0]) {
				for (int i = 0; i < contig.size() - 1; i++)
					if (contig.get(i) > 0)
						if (contig.get(i + 1) == -1 && i < contig.size() - 2) {
							int len = contig.get(i) + 1 + contig.get(i + 2);
							if (len > max)
								max = len;
						} else {
							int len = contig.get(i) + 1;
							if (len > max)
								max = len;
						}
					else {
						int len = contig.get(i + 1) + 1;
						if (len > max)
							max = len;
					}
			}

			System.out.println(max);
		}

		scan.close();
		System.exit(0);
	}

}