import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		sc.nextLine();
		int n = sc.nextInt();
		String[] array = new String[w];
		int rowCount = 0;
		int direct = 0;
		int columCount = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if (w < h) {
				for (int j = 0; j < a; j++) {
					sb.append(i + 1);
					rowCount++;
					if (rowCount == w) {
						if (direct == 1) {
							System.out.println(sb.reverse().toString());
							direct = 0;
						} else {
							System.out.println(sb.toString());
							direct = 1;
						}
						rowCount = 0;
						sb.setLength(0);
					}
				}
			} else {
				for (int j = 0; j < a; j++) {
					sb.append(i + 1);
					rowCount++;
					if (rowCount == h) {
						if (direct == 1) {
							array[columCount++] = sb.reverse().toString();
							direct = 0;
						} else {
							array[columCount++] = sb.toString();
							direct = 1;
						}
						rowCount = 0;
						sb.setLength(0);
					}
				}
			}
			
		}
		sc.close();
		
		if (w >= h) {
			sb.setLength(0);
			for (int i = 0; i < h; i++) {
				for (String str : array) {
					sb.append(str.charAt(i));
				}
				System.out.println(sb.toString());
				sb.setLength(0);
			}
		}
	}
}