import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String N = in.next();
		if(N.length()==2) {
			System.out.println(N);
		}else {
			for(int i=0;i<3;i++) {
				System.out.print(N.charAt(2-i));
			}
		}

	}
}
