import java.util.Scanner;

public class Main {
	static char[] AZ = {'A','Z'};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		char[] c = s.toCharArray();
		int cnt = 0;
		int len = c.length/2;
		int max = c.length;
		for(int i=0;i<len;i++) {
//			System.out.println(c[i] + ";" + c[len+(c.length%2)+i]);
//			System.out.println(c[i] + ";" + c[max-1-i]);
			if(c[i]!=c[max-1-i]) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}