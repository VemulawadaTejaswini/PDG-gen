import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		int ans = 0;
		for(int i = 0; i < 3;i++) {
			if(s.charAt(i) == t.charAt(i)) {
				ans++;
			}
		}
		System.out.println(ans);

	}

}
