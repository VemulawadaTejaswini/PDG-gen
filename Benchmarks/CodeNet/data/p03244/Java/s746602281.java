import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] vo = new int[n / 2];
		int[] ve = new int[n / 2];

		for (int i = 0; i < n / 2; i++) {
			vo[i] = sc.nextInt();
			ve[i] = sc.nextInt();
		}

		Arrays.sort(vo);
		Arrays.sort(ve);
		int maxo = 1;
		int maxe = 1;
		int seco = 0;
		int sece = 0;
		int numo = 0;
		int nume = 0;

		int j = 0, k = 0;
		int ans = -1;

		while (j != n / 2 - 1) {
			int count = 1;
			while (vo[j] == vo[j + 1]) {
				count++;
				j++;
				if (j == n / 2 - 1) {
					break;
				}
			}
			if (j != n / 2 - 1) {
				j++;
			}
			if (seco <= count) {
				if (maxo <= count) {
					seco = maxo;
					maxo = count;
					numo = vo[j-1];
				} else {
					seco = count;
				}
			}

		}

		while (k != n / 2 - 1) {
			int count = 1;
			while (ve[k] == ve[k + 1]) {
				count++;
				k++;
				if (k == n / 2 - 1) {
					break;
				}
			}
			if (k != n / 2 - 1) {
				k++;
			}
			if (sece <= count) {
				if (maxe <= count) {
					sece = maxe;
					maxe = count;
					nume = ve[k-1];
				} else {
					sece = count;
				}
			}

		}

		if (maxo == n / 2 && maxe == n / 2) {
			if (vo[0] == ve[0]) {
				ans = n / 2;
			} else {
				ans = 0;
			}
		} else if (numo != nume) {
			ans = (n / 2 - maxo) + (n / 2 - maxe);
		} else {
			ans = Math.min((n / 2 - maxo) + (n / 2 - sece), (n / 2 - maxe) + (n / 2 - seco));
		}

		System.out.println(maxo + "," + maxe + "," + seco + "," + sece + "," + numo + "," + nume);
		System.out.println((n / 2 - maxo) + "," + (n / 2 - maxe) + "," + (n / 2 - seco) + "," + (n / 2 - sece));
		System.out.println(ans);

	}
}