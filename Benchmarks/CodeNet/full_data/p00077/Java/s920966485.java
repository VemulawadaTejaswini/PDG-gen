import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String s = sc.next();
			int l = s.length();
			String t = "";
			int k = 0;
			boolean flag = false;
			for(int i = 0; i < l; i++) {
				if(s.charAt(i) == '@') {
					flag = true;
				}else {
					if(flag) {
						if(k == 0) {
							k = s.charAt(i) - '0';
						}else {
							for(int j = 0; j < k; j++) {
								t += s.charAt(i);
							}
							k = 0;
							flag = false;
						}
					}else {
						t += s.charAt(i);
					}
				}
			}
			System.out.println(t);
		}
		sc.close();
	}
}
