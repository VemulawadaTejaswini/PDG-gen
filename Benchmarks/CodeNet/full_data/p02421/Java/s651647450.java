import java.util.*;

public class Main {

	public static void main(String[] args) {
		String taro, hanako;
		int taroP = 0, hanakoP = 0;
		int length;
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			taro = sc.next();
			hanako = sc.next();
			if (taro.length() < hanako.length())
				length = taro.length();
			else
				length = hanako.length();
			for (int j = 0; j < length; j++) {
				if (taro.charAt(j) > hanako.charAt(j)) {
					taroP += 3;
					flag = true;
					break;
				} else if (taro.charAt(j) < hanako.charAt(j)) {
					hanakoP += 3;
					flag = true;
					break;
				}
			}
			if (flag == false) {
				if (taro.equals(hanako)) {
					taroP += 1;
					hanakoP += 1;
				} else if (taro.length() > hanako.length())
					taroP += 3;
				else
					hanakoP += 3;
			}
			flag = false;
		}

		System.out.println(taroP + " " + hanakoP);
	}
}