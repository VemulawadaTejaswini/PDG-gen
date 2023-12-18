import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i;
		String s;
		n = sc.nextInt();
		s = sc.next();
		char[] sArray = s.toCharArray();

		for(i = 0; i < n; i++) {
			if(sArray[i] == '.') {
				if(sArray[i + 1] == '#' || sArray[i - 1] == '#') {
				    i++;
					break;
				}
			}
		}
		System.out.println(i);
		sc.close();
	}
}