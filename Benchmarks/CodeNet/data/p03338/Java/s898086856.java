import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String s = sc.next();
		
		int x = n/2;
		int y = n-x;
		
		String xStr = s.subString(0, x);
		String yStr = s.subString(x, y);

		int cnt = 0;
		for (int i = 0; i < x; i++) {
			String z = xStr.subString(i, i+1);
			if ( yStr.contains(z) ){
				cnt++;
			}
		}

		System.out.println(cnt);

		sc.close();

	}
}