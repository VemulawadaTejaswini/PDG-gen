import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] str = in.next().toCharArray();
		int len = str.length;
		int half = len / 2;
		int hugs = 0;
		for (int i = 0; i < half; i++)
			if (str[i] != str[len - 1 - i])
				hugs++;
		System.out.println(hugs);
	}
}
