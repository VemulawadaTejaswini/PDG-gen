import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int count = 0;
		if(s.contains("R")){
			 if(s.charAt(0)==s.charAt(1)&&
						s.charAt(0)==s.charAt(2)){
					count = 3;
				}
			else if(s.charAt(0)=='R'&&s.charAt(1)=='R'
					|| s.charAt(1)=='R'&&s.charAt(2)=='R') {
				count = 2;
			}
			else {
				count = 1;
			}
		}
		System.out.println(count);
	}
}