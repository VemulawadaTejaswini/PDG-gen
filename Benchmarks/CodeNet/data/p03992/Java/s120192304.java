import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] lst = new char[12];
		String tmp = sc.nextLine();
		lst = tmp.toCharArray();
		String result = "";
		for (int i = 0; i < 12; i++) {
			result += lst[i];
			if (i == 3) {
				result += " ";
			}
		}
		System.out.println(result);
	}
}
