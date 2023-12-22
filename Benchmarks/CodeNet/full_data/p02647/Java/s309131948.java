import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			int num = sc.nextInt();
			int k = sc.nextInt();

			int a[] = new int[num];

			for (int i = 0; i < num; i++) {
				a[i] = sc.nextInt();

			}

			for (int times = 0; times < k; times++) {
				int akarusa[] = new int[num];
				for (int i = 0; i < a.length; i++) {
					for (int j = -a[i]; j <= a[i]; j++) {
						if (0 <= i + j && i + j < akarusa.length) {
							akarusa[i + j]++;
						}

					}
				}

				boolean flag = true;
				for (int i = 0; i < a.length; i++) {
					if (a[i] != akarusa[i])
						flag = false;
				}
				if (flag) {
					break;
				} else {
					a = akarusa;
				}

			}

			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + " ");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}