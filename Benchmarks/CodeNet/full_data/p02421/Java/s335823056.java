import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int n = Integer.parseInt(sc.next());
		int taroScore = 0, hanakoScore = 0;
		for (int i=0; i < n; i++) {
			String taro = sc.next(), hanako = sc.next();
			if (taro.compareToIgnoreCase(hanako) < 0) hanakoScore += 3;
			else if (taro.compareToIgnoreCase(hanako) > 0) taroScore += 3;
			else { taroScore++; hanakoScore++; }
		}
		sc.close(); System.out.println(taroScore + " " + hanakoScore);
	}
}