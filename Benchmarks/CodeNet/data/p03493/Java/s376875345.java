import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		int cnt = 0;
		if(s.charAt(0)=='1')cnt++;
		if(s.charAt(1)=='1')cnt++;
		if(s.charAt(2)=='1')cnt++;
		System.out.println(cnt);
	}
}
