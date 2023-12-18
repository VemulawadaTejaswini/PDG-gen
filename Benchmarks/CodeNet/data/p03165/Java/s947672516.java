import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str[] = {sc.next(), sc.next()};
		String dpStr[][] = new String[str[0].length() + 1][str[1].length() + 1];
		String dpLongest[][] = new String[str[0].length() + 1][str[1].length() + 1];

		for(int i = 0; i <= str[0].length(); i ++) {
			dpStr[i][0] = "";
			dpLongest[i][0] = dpStr[i][0];
		}
		for(int j = 0; j <= str[1].length(); j ++) {
			dpStr[0][j] = "";
			dpLongest[0][j] = dpStr[0][j];
		}
		for(int i = 1; i <= str[0].length(); i ++) {
			for(int j = 1; j <= str[1].length(); j ++) {
				dpStr[i][j] = str[0].charAt(i - 1) == str[1].charAt(j - 1)
					? dpLongest[i - 1][j - 1] + str[0].charAt(i - 1)
					: "";
				dpLongest[i][j] = dpLongest[i - 1][j].length() > dpLongest[i][j - 1].length()
					? dpLongest[i - 1][j]
					: dpLongest[i][j - 1];
				dpLongest[i][j] = dpStr[i][j].length() > dpLongest[i][j].length()
					? dpStr[i][j]
					: dpLongest[i][j];
			}
		}

		System.out.println(dpLongest[str[0].length()][str[1].length()]);
	}
}