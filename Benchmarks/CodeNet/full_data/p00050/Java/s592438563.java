import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = sc.nextLine().split(" ");
		sc.close();
		for(int i = 0; i < s.length; i++) {
			if(s[i].equals("apple")) {
				s[i] = "peach";
			}else if(s[i].equals("peach")) {
				s[i] = "apple";
			}
		}
		for(int i = 0; i < s.length; i++) {
			if(i == s.length - 1) {
				System.out.println(s[i]);
			}else {
				System.out.printf("%s ", s[i]);
			}
		}
	}
}

