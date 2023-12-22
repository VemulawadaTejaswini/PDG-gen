import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		String ans ="";
		Scanner scan_1 = new Scanner(System.in);
		int num  = scan_1.nextInt();
		String str = scan_1.next();


		int nagasa = str.length();

		if(nagasa <= num) {
			ans = str;
		}else {
			ans = str.substring(0, num)+"...";
		}

		System.out.println(ans);
	}

}