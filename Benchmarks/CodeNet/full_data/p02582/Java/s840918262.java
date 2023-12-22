import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		char[] s_one = s.toCharArray();
		boolean chain = true;
		int count = 0;

		for(int i = 0;i < 3;i++) {
			if(chain) {
				if(s_one[i] != 'R') {
					chain = false;
				}else {
					count += 1;
				}
			}else {
				if(s_one[i] == 'R') {
					chain = true;
				}
			}
		}

		System.out.println(count);
	}
}
