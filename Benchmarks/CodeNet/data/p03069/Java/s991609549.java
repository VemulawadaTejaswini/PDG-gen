import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i;
		int count = 0;
		String s;
		n = sc.nextInt();
		s = sc.next();
		char[] sArray = s.toCharArray();

		for(i = 0; i < n - 1; i++) {
			if(sArray[i] == '#') {
				if(sArray[i + 1] == '.') {
				    count++;
				    sArray[i + 1] = '#';
				}
			}
		}
		System.out.println(count);
		sc.close();
	}
}