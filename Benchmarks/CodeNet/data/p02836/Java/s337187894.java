import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		scan.close();

		char c[] = str.toCharArray();
		int cnt=0;
		for(int i=0;i<c.length/2;i++) {
			if(c[i]!=c[c.length-1-i]) {
				cnt++;
			}
		}

		System.out.println(cnt);

	}

}