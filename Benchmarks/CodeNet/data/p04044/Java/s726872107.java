import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		int nagasa = sc.nextInt();
		int kosuu = sc.nextInt();
		String ans = "";
		for(int i = 0; i < kosuu; i++) {
			String a = sc.next();
			list.add(a);
		}
		Collections.sort(list);
		for(int j = 0; j < kosuu; j++) {
			ans += list.get(j);
		}
		System.out.println(ans);
	}
}