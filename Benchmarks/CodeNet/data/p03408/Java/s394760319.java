import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int blue = sc.nextInt();
		String[] s = new String[blue];
		for (int i = 0; i < blue; i++)
			s[i] = sc.next();
		int red = sc.nextInt();
		String[] t = new String[red];
		for (int i = 0; i < red; i++)
			t[i] = sc.next();
		int count = -1;
		int max = 0;
		for (int i = 0; i < blue; i++) {
			for (int j = 0; j < blue; j++) {
				if (s[i].equals(s[j]))
					count++;
			}
			for (int k = 0; k < red; k++) {
				if (s[i].equals(t[k]))
					count--;
			}
			max = Math.max(max, count);
			count = 0;
		}
		System.out.println(max);
	}
}