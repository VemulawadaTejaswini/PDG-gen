import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		StringBuilder ss = new StringBuilder();
		sc.close();
		ss.append(s);
		int c = 0;
		int d = 0;
		for(int i =1; i<n; i++) {
			if(ss.charAt(i)=='.'&&ss.charAt(i-1)=='#') {
				c++;
				ss.setCharAt(i, '#');
			}
		}
		for(int i =1; i<n; i++) {
			if(ss.charAt(i)=='.'&&ss.charAt(i-1)=='#') {
				d++;
				ss.setCharAt(i-1, '.');
			}
		}
	
	System.out.println(Math.min(c, d));
	
	
	
	}
}