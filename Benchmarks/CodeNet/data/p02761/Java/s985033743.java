import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

		int result = -1;
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] s = new int[m];
		int[] c = new int[m];
		for(int i = 0; i < m; i++){
			s[i] = scanner.nextInt();
			c[i] = scanner.nextInt();
		}
		int maxNum = 0;
		if(n == 1) maxNum = 9;
		if(n == 2) maxNum = 99;
		if(n == 3) maxNum = 999;

		if(n == 1){
			if(m == 0){
				result = 0;
			}else{
				Arrays.sort(c);
				int tmp = c[0];
				result = c[0];
				for(int i = 0; i<m; i++){
					if(tmp != c[i]){
						result = -1;
						break;
					}
					tmp = c[i];
				}
			}

		}

		if(n == 2){
			Boolean isOK = false;
			for(int i = 10; i <= maxNum; i++){
				isOK = checkTwo(i,s,c);
				if(isOK){
					result = i;
					break;
				}
			}
		}

		if(n == 3){
			Boolean isOK = false;
			for(int i = 100; i <= maxNum; i++){
				isOK = checkThree(i,s,c);
				if(isOK){
					result = i;
					break;
				}
			}
		}
		System.out.println(result);
	}
	private static Boolean checkTwo(int i, int[] s, int[] c){
		int tt = i /10;
		int t = i%10;
		Boolean isOK = true;
		for(int j = 0; j < s.length; j++){
			if(s[j] == 1){
				if(tt != c[j]){
					isOK = false;
					break;
				}
			}

			if(s[j] == 2){
				if(t != c[j]){
					isOK = false;
					break;
				}
			}
		}
		return isOK;
	}

	private static Boolean checkThree(int i, int[] s, int[] c){
		int ttt = i / 100;
		int tt = (i % 100) /10;
		int t = i%10;
		Boolean isOK = true;
		for(int j = 0; j < s.length; j++){
			if(s[j] == 1){
				if(ttt != c[j]){
					isOK = false;
					break;
				}
			}

			if(s[j] == 2){
				if(tt != c[j]){
					isOK = false;
					break;
				}
			}

			if(s[j] == 3){
				if(t != c[j]){
					isOK = false;
					break;
				}
			}
		}
		return isOK;
	}

}
