import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[]d = new int[6];
		for(int i = 0; i < 6; i++) {
			d[i] = scan.nextInt();
		}
		String s = scan.next();
		scan.close();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int []t = new int[6];
			for(int j = 0; j < 6; j++) {
				t[j] = d[j];
			}
			if(c == 'E') {
				d[0] = t[3];
				d[5] = t[2];
				d[2] = t[0];
				d[3] = t[5];
			}else if(c == 'W') {
				d[0] = t[2];
				d[2] = t[5];
				d[5] = t[3];
				d[3] = t[0];
			}else if(c == 'N') {
				d[0] = t[1];
				d[4] = t[0];
				d[5] = t[4];
				d[1] = t[5];
			}else {
				d[0] = t[4];
				d[4] = t[5];
				d[5] = t[1];
				d[1] = t[0];
			}
		}
		System.out.println(d[0]);
	}
}
