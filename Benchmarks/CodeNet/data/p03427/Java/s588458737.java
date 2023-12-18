import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] n = sc.next().toCharArray();
		int ans = 0;
		for(int i = 0;i < n.length; i++) {
			ans += n[i]-'0';
		}
		for(int i= 1; i < n.length ; i++) {
			n[i] = '9';
		}
		
		int temp = 0;
		for(int i = 0 ; i < n.length; i++) {
			if(i==0) {
				temp += n[i]-'1';
			}
			else {
				temp += n[i]-'0';
			}
		}
		ans = Math.max(ans, temp);
		System.out.println(ans);
	}
}