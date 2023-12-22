import java.util.Scanner;

//20180511
//02

public class Main {
    public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		String str = scanner.next();
		char[] list = str.toCharArray();
		int count = scanner.nextInt();

		for(int i = 0;i < count;i++) {
			String order = scanner.next();
			int a = scanner.nextInt();
			int b = scanner.nextInt();

			if("print".equals(order)) {
				for (int j = a; j <= b; j++) {
					System.out.println(list[j]);
				}
			}

			if("reverse".equals(order)) {
				for (int j = a, k = b; j < k; j++, k--) {
					char tmp = list[j];
					list[j] = list[k];
					list[k] = tmp;
				}
			}

			if("replace".equals(order)) {
				String replace = scanner.next();
				char[] replist = replace.toCharArray();
				for (int j = a; j <= b; j++) {
					list[j] = replist[j-a];
				}
			}
		}
		scanner.close();
    }
}
