import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s[] = new String[N];
		String tmp[] = new String[10];
		String tmpStr;
		List lst = new ArrayList<String>();
		int answer = 0;

		for (int i = 0; i < N; i++) {
			tmpStr = sc.next();
			tmp = tmpStr.split("");
			Arrays.sort(tmp);
			s[i] = Arrays.toString(tmp);
			for (int j = 0; j < i - 1; j++) {
				if (lst.get(j).equals(s[i])) answer++;
			}
			lst.add(Arrays.toString(tmp));

		}

		System.out.println(answer);
	}
}
