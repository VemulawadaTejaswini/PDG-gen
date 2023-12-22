import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nest = 0;
		boolean flag = true;
		for(int i=0;i<n;i++) {
			int dx = 0;
			String s = sc.next();
			if (s.equals("(")) {
				dx = 1;
			}else{
				dx = -1;
			}
			nest += dx * sc.nextInt();
			if (nest < 0) {
				flag = false;
				break;
			}
		}
		if (nest!=0) {
			flag = false;
		}
		System.out.println(flag ? "YES" : "NO");
	}

}