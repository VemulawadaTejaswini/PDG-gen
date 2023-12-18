import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String s = sc.next();
		String[] strArray = sc.next().split(" ");
		System.out.println(strArray);
		int[] intArray = new int[201];
		int res = 0;

		for (int i = 0; i < strArray.length; i++) {
			intArray[i] = Integer.parseInt(strArray[i]);
		}

		while (true) {
			boolean exist_odd = false;
			for (int i = 0; i < strArray.length; i++)
				if (intArray[i] % 2 != 0)
					exist_odd = true;

			if (exist_odd)
				break;

			for (int k = 0; k < strArray.length; k++) {
				intArray[k] /= 2;
			}

			res++;
		}
		System.out.println(res);
	}
}
