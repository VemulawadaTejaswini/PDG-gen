import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try (Scanner sc = new Scanner(System.in)) {
				String s = sc.nextLine();
				String t = sc.nextLine();

				int len = t.length();

				int ans = 0;

				for (int i = 0; i < (len - 1); i++) {
					for (int j = len; (j - i) > 0; j--) {

						String subS = s.substring(i);
                        String subT = t.substring(i, j);

						if (subS.contains(subT)) {
							ans = Math.max(subT.length(), ans);
                          	break;
						}
					}
				}
				ans = len - ans;				
				System.out.println(String.valueOf(String.valueOf(ans)));

			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}