import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s = sc.next();
		int count =0;
		int i=0;
		int white=0;
		int black =0;
		while (i<N) {
			while (i<N&&s.charAt(i)=='.') {
				i++;
			}
			while (i<N&&s.charAt(i)=='#') {
				black++;
				i++;
			}
			while (i<N&&s.charAt(i)=='.') {
				i++;
				white++;
			}
			count +=Math.min(black, white);
			white=0;
			black=0;
		}
		System.out.println(count);
	}
}