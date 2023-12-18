import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		char before = s.charAt(0);
		int changecnt = 0;
		for(int i = 1;i < n;i ++) {
			char c = s.charAt(i);
			if(before == '#' && c == '.') changecnt++;
		}
		System.out.println(changecnt);
	}
}