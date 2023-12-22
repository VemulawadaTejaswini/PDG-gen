import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int k = Integer.parseInt(scan.nextLine());
		String s = scan.nextLine();
		StringBuilder sb = new StringBuilder(s);

		int w = s.indexOf('W');
		int r = s.lastIndexOf('R');
		int count = 0;

		if(k==s.length()) {
		}
		while(w < r){
			sb.setCharAt(w, 'R');
			sb.setCharAt(r, 'W');
			count++;
			w = sb.indexOf("W");
			r = sb.lastIndexOf("R");
		}
		System.out.println(count);



		scan.close();
	}
}
