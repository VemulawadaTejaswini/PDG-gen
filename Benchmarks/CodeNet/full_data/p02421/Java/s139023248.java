import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int taro = 0;
		int hanako = 0;
		for (int i=0; i<n; i++) {
			String t = sc.next();
			String h = sc.next();
			if (t.compareTo(h) < 0) {hanako += 3;}
			else if (t.compareTo(h) > 0) {taro += 3;}
			else {hanako++; taro++;}
		}
		System.out.println(taro+" "+hanako);
	}
}
