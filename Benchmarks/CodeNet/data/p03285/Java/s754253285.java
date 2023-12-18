import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		atcode();
	}

	public static void atcode() {
		Integer N=Integer.valueOf(new Scanner(System.in).nextLine());
		boolean yes=false;
		for(int d=N/7;d>=0;d--) {
			for(int c=N/4;c>=0;c--) {
				if(7*d+4*c==N)yes=true;
			}
		}
		System.out.println(yes?"Yes":"No");
	}
}