import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(find(sc.nextInt()));
	}

	static String find(int n) {
		for (int i = 1; i <= 9; i++)
			for (int j = 1; j <= 9; j++)
				if (i * j == n)
					return "Yes";
		return "No";
	}
}
