import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		Long a = scan.nextLong();
		Long b = scan.nextLong();
		Long c = scan.nextLong();
		String result = "No";
		int ca = 0;
		int cb = 0;
		int cc = 0;


		for(int i=1;a>i;i+=2) {
			a -= i;
			ca++;
		}
		for(int i=1;b>i;i+=2) {
			b -= i;
			cb++;
		}
		for(int i=1;c>i;i+=2) {
			c -= i;
			cc++;
		}

		if(ca+cb<cc) {
			result="Yes";
		}

		System.out.println(result);

	}
}