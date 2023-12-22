import java.util.Scanner;
import static java.util.Arrays.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] list = new int[5];
		for(int i = 0; i < 5; i++) list[i] = in.nextInt();
		sort(list);
		String s = "";
		StringBuilder buf = new StringBuilder();
		for(int i = list.length-1; i >= 0 ; i--) {
			buf.append(s);
			buf.append(list[i]);
			s = " ";
		}
		System.out.println(buf.toString());
	}
}