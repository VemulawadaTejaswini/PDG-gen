import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = sc.next().split("");
		int count = 0;
		while (true) {
			boolean comp = true;
			for (int i = 1; i < s.length; i++) {
				if (!s[i].equals(s[i - 1])) {
					comp = false;
					break;
				}
			}
			if (comp)
				break;
			String[] tem = new String[s.length + 1];
			for (int i = 0; i < s.length; i++)
				tem[i] = s[i];
			if (s[s.length - 1].equals("B"))
				tem[tem.length - 1] = "W";
			else
				tem[tem.length - 1] = "B";
			count++;
			int index = tem.length - 2;
			while (!tem[index].equals(tem[tem.length - 1])) {
				tem[index] = tem[tem.length - 1];
				index--;
			}
			s = tem;
		}
		System.out.println(count);
	}
}