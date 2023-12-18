import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		long N = scn.nextLong();
		String ans = "";
		boolean pl = true;
		while(N!=0) {
			if(N%2!=0) {
				ans+="1";
				N += pl?-1:1;
			}else {
				ans+="0";
			}
			pl = !pl;
			N /=2;
		}
		StringBuffer ans_r = new StringBuffer(ans);
		System.out.println(ans_r.reverse().toString());
		scn.close();
	}
}