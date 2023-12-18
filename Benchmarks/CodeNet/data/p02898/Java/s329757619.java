import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String n =sc.next();
		int m = Integer.parseInt(n);
		String k = sc.next();
		int l = Integer.parseInt(k);
		int cnt =0;
		for (int i=1; i<=m ;i++) {
			String hi = sc.next();
			int hii = Integer.parseInt(hi);
			if(hii >= l) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
