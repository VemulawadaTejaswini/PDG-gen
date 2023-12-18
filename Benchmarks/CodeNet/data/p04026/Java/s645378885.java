import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if (s.length()==2) {
			if (s.charAt(0)==s.charAt(1)) {
				System.out.println("1 2");
			} else {
				System.out.println("-1 -1");
			}
			return ;
		}
		for (int i=0;i<s.length()-2;i++) {
			String temp = s.substring(i,i+3);
			if (temp.charAt(0)==temp.charAt(1)||temp.charAt(1)==temp.charAt(2)||temp.charAt(0)==temp.charAt(2)) {
				System.out.println(i+1+" "+(i+3));
				return;
			}
		}
		System.out.println("-1 -1");
	}
}