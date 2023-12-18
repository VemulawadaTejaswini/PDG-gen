import java.util.Scanner;

public class  Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String[] str = s.split("");
		String ans = "";

		for(int i=0; i<s.length(); i++) {
			if(i%2==0) {
				ans += str[i];
			}
		}
		System.out.println(ans);

	}

}
