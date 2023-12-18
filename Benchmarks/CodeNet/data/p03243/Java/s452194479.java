import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.next();
		int N = Integer.parseInt(in);
		int earliest = 1200;
		for(char c: in.toCharArray()) {
			String s = new Character(c).toString();
			int i = Integer.parseInt(s + s + s);
			if(i >= N && i < earliest) {
				earliest = i;
			}
		}
		System.out.println(earliest);
	}

}
