import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		Person[] persons = new Person[N];
		for (int i = 0; i < N; i++) {
			int A = in.nextInt();
			Person person = new Person();
			int[] tes = new int[N];
			Arrays.fill(tes, -1);
			tes[i] = 1;
			for (int j = 0; j < A; j++) {
				tes[in.nextInt() - 1] = in.nextInt();
			}
			person.tes = tes;
			persons[i] = person;
		}
		int ans = 0;
		for (int i = 0; i < persons.length; i++) {
			boolean isOk = true;
			int[] t = new int[N];
			System.arraycopy(persons[i].tes, 0, t, 0, N);
			for (int j = 0; j < persons.length; j++) {
				if (i == j || t[j] == 0) {
					continue;
				}
				int[] ts = new int[N];
				System.arraycopy(persons[i].tes, 0, ts, 0, N);
				boolean isBack = false;
				int index = 0;
				for (int j2 = 0; j2 < N; j2++) {
					if (t[j2] == -1 && persons[j].tes[j2] == 1) {
						t[j2] = 1;
					} else if (t[j] == -1 && t[j2] == 1 && persons[j].tes[j2] == 0) {
						isBack = true;
						index = j;
						break;
					} else if ((persons[i].tes[j2] != -1 && persons[j].tes[j2] != -1)
							&& persons[i].tes[j2] != persons[j].tes[j2]) {
						isOk = false;
						break;
					}
				}
				if (!isOk) {
					break;
				}
				if (isBack) {
					t = ts;
					t[index] = 0;
				}

			}
			int max = 0;
			if (isOk) {
				for (int j = 0; j < t.length; j++) {
					if (t[j] == 1 || t[j] == -1) {
						max++;
					}
				}
			}
			ans = Math.max(ans, max);
		}
		System.out.println(ans);
		in.close();

	}
}

class Person {

	int[] tes;

}
