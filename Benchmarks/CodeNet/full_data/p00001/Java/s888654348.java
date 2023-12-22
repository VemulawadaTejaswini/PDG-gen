import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = null;

		try {
			sc = new Scanner(System.in);
			int[] hillList = new int[10];

			for (int i = 0; i < 10; i++) {
				hillList[i] = sc.nextInt();
			}
			Arrays.sort(hillList);
			int n = hillList.length - 1;
			for (int j = 0; j < 3; j++) {

				System.out.println(hillList[n]);
				n--;
			}
		}catch (Exception e) {
			System.out.println(e);
		} finally {
			if (sc != null) {
				try {
					sc.close();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
	}

}