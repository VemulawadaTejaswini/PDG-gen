import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = 0, xMax = 0;
		int N  = sc.nextInt();
		String S = sc.next();
		for(int i = 0; i < N; i++) {
			char c = S.charAt(i);
			if(c == 'I') {
				x++;
			}
			else if(c == 'D') {
				x--;
			}
			if(xMax < x) {
				xMax = 0;
			}
		}
		System.out.println(xMax);

	}

}