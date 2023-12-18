import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str[] = {sc.next(), sc.next()};
		int length[] = {str[0].length(), str[1].length()};
		char ch[][] = {str[0].toCharArray(), str[1].toCharArray()};
		int dpLength[][] = new int[length[0] + 1][length[1] + 1];

		for(int i = 0; i <= length[0]; i ++) {
			dpLength[i][0] = 0;
		}
		for(int j = 0; j <= length[1]; j ++) {
			dpLength[0][j] = 0;
		}

		for(int i = 1; i <= length[0]; i ++) {
			for(int j = 1; j <= length[1]; j ++) {
				dpLength[i][j] = ch[0][i - 1] == ch[1][j - 1]
					? dpLength[i - 1][j - 1] + 1
					: Math.max(dpLength[i - 1][j], dpLength[i][j - 1]);
			}
		}

		String ans = "";
		int i = length[0];
		int j = length[1];
		while(i > 0 && j > 0) {
			if(ch[0][i - 1] == ch[1][j - 1]) {
				ans = ch[0][i - 1] + ans;
				i --;
				j --;
			}else if(dpLength[i - 1][j] > dpLength[i][j - 1]) {
				i --;
			}else {
				j --;
			}
		}
		System.out.println(ans);
	}
}