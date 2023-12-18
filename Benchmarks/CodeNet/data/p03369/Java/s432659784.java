import java.util.Scanner;
public class Main{
	public static int Int(char a) {
		if(a=='o') {
			return 100;
		}
		else {
		return 0;
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a=scan.next();
		int ans=700;
		ans+=Int(a.charAt(0));
		ans+=Int(a.charAt(1));
		ans+=Int(a.charAt(2));
	System.out.println(ans);
	}
}