import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] c = s.toCharArray();
		int z = 0;
		int o = 0;
		for(int i = 0;i < c.length; i++) {
			if(c[i] == '0') {
				z++;
			}
			else {
				o++;
			}
		}
		System.out.println(Math.min(z, o)*2);
	}
}
