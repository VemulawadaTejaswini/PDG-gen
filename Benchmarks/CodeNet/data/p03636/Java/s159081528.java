import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		char s[] = sc.next().toCharArray();
		System.out.println(s[0] + "" + (s.length - 2) + "" + s[s.length - 1]);
	}
}
