import java.util.*;
public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String X = sc.nextLine(),Y = sc.nextLine();
		int dec_x = Integer.parseInt(X,16),dec_y = Integer.parseInt(Y,16);
		if(dec_x < dec_y) {
			System.out.print("<");
		}else if(dec_x > dec_y) {
			System.out.print(">");
		}else {
			System.out.print("=");
		}
	}
}
