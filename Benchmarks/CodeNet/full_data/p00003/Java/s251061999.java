import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = null;
		int[] triangle = new int[3];

		try {
			sc = new Scanner(System.in);

			int numQ = sc.nextInt();

			for (int i = 0; i < numQ; i++) {
				for (int j = 0; j < triangle.length; j++) {
					triangle[j] = sc.nextInt();
				}
					Arrays.sort(triangle);
					if (Math.pow(triangle[0], 2) + Math.pow(triangle[1], 2) == Math.pow(triangle[2], 2)) {
						System.out.println("YES");
					}else{
						System.out.println("NO");
					}
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