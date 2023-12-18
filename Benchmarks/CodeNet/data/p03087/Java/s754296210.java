import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int len = sc.nextInt();
		int s = sc.nextInt();
		String str = sc.next();
		String str2 = "";
		int cnt = 0;
		
		for(int i = 0; i < s; i++) {
			str2 = str.substring(sc.nextInt() - 1, sc.nextInt());
			for(int j = 0; j < str2.length(); j++) {
				if(str2.indexOf("AC") >= 0) {
					cnt++;
					str2 = str2.substring(str2.indexOf("AC") + 2, str2.length());
				}			
			}
			
			System.out.println(cnt);
			cnt = 0;
		}
	}

}