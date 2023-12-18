import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str[] = {sc.next(), sc.next()};
		int length[] = {str[0].length(), str[1].length()};
		char ch[][] = {str[0].toCharArray(), str[1].toCharArray()};
		StringBuilder dpStr[][] = new StringBuilder[length[0] + 1][length[1] + 1];
		StringBuilder dpLongest[][] = new StringBuilder[length[0] + 1][length[1] + 1];
		int dpLength[][] = new int[length[0] + 1][length[1] + 1];


		for(int i = 0; i <= length[0]; i ++) {
			for(int j = 0; j <= length[1]; j ++) {
				dpStr[i][j] = new StringBuilder();
				dpLongest[i][j] = new StringBuilder();
			}
		}
		for(int i = 0; i <= length[0]; i ++) {
			dpStr[i][0].append("");
			dpLongest[i][0] = dpStr[i][0];
		}
		for(int j = 0; j <= length[1]; j ++) {
			dpStr[0][j].append("");
			dpLongest[0][j] = dpStr[0][j];
		}

		for(int i = 1; i <= length[0]; i ++) {
			for(int j = 1; j <= length[1]; j ++) {
				if(ch[0][i - 1] == ch[1][j - 1]) {
					dpStr[i][j].append(dpLongest[i - 1][j - 1]);
					dpStr[i][j].append(ch[0][i - 1]);
					dpLongest[i][j].append(dpStr[i][j]);
				}else {
					dpStr[i][j].append("");
					dpLongest[i][j].append(dpLength[i - 1][j] > dpLength[i][j - 1]
						? dpLongest[i - 1][j]
						: dpLongest[i][j - 1]);
				}
				dpLength[i][j] = dpLongest[i][j].length();
			}
		}

		System.out.println(dpLongest[length[0]][length[1]]);
	}
}