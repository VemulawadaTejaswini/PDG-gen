import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		String line = sc.nextLine().toUpperCase();
		String[] lines = line.split(" ");
		for(int i=0; i<3; i++) {
			sb.append(lines[i].charAt(0));
		}
		System.out.println(sb);
	}
}
