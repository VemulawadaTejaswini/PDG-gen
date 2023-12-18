import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	//C問題

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scan = new Scanner(System.in);

		int n, k;

		n = scan.nextInt();
		k = scan.nextInt();

		List<Integer> amariList = new ArrayList<>();

		while (true) {
			int sho;
			int amari;

			sho = n / k;
			amari = n % k;

			amariList.add(amari);

			n = sho;

			if (sho == 0) {
				break;
			}
		}

		System.out.println(amariList.size());
	}

}
