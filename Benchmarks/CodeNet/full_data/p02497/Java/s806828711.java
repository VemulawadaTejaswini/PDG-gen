import java.util.*;

/* No.10016 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int m = sc.nextInt() , f = sc.nextInt() , r = sc.nextInt();
			if ( m == -1 && f == -1 && r == -1 ) break;
			String result = m == -1 || f == -1 ? "F" :
				m + f >= 80 ? "A" :
				m + f >= 65 ? "B" :
				m + f >= 50 ? "C" :
				m + f >= 30 && r >= 50 ? "C" :
				m + f >= 30 ? "D" : "F";
			System.out.println(result);
		}
	}
}