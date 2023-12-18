import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan =new java.util.Scanner(System.in);
		String  n = scan.next();
		String week[] = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		int ans = 0;

		for(int i=0;i<7;i++) {
		 if(n.equals(week[i])) {
			ans = 7-i;
			break;
		 }
		}

		System.out.println(ans);
	}

}
