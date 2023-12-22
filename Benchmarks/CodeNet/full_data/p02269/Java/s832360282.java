import java.util.Scanner;

public class Main {

	static int count = 0;

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();

		String[] strArray = new String[n];
		int end = 0;
		StringBuffer sb = new StringBuffer();

		for(int i = 0; i < n; i++) {
			String order = sc.next();
			String str = sc.next();

			if(order.equals("insert")) {
				strArray[end] = str;
				end++;
			} else {
				boolean chk = false;

				for(int j = 0; j < end; j++) {
					if(str.equals(strArray[j])) {
						chk = true;
						break;
					}
				}
				if(chk) {
					sb.append("yes\n");
				} else {
					sb.append("no\n");
				}
			}
		}
		System.out.println(sb);
	}

}
