import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int k = Integer.parseInt(scan.nextLine());
		String s = scan.nextLine();

		int w = s.indexOf('W');
		int r = s.lastIndexOf('R');
		int count = 0;

		if(k==s.length()) {
		}
		if(w < 0 || r < 0) {
			System.out.println(0);
		}else {
			while(w < r){
				StringBuilder sb = new StringBuilder(s);
				sb.setCharAt(w, 'R');
				sb.setCharAt(r, 'W');
				s = sb.toString();
				count++;
				w = s.indexOf('W');
				r = s.lastIndexOf('R');
			}
			System.out.println(count);
		}



		scan.close();
	}
}
