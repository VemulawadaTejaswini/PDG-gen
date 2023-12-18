import java.util.*;
public class  Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char head = str.charAt(0);
		int body = str.length() - 2;
		char leg = str.charAt(body+1);
		System.out.println(head+body+leg);
	}
}