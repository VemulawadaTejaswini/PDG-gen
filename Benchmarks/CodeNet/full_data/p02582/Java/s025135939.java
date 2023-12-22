import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int cnt = 0;
		for(int i=0; i < 3; i++) {
			if(S.charAt(i)=='R') {
				if(i==2&&S.charAt(1)=='S'){
                  cnt=0;
                }
				  cnt++;
			}
		}
		System.out.println(cnt);
	}
}