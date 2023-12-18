import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int sx  = sc.nextInt();
			int sy  = sc.nextInt();
			int tx  = sc.nextInt();
			int ty  = sc.nextInt();
		sc.close();

		String m = "";

		for(int i = sx ; i < tx ; i++){
			m += "R";
		}
		for(int i = sy ; i < ty ; i++){
			m += "U";
		}

		for(int i = sx ; i < tx ; i++){
			m += "L";
		}
		for(int i = sy ; i < ty ; i++){
			m += "D";
		}
		int sx2 = sx-1;
		int sy2 = sy-1;
		int tx2 = tx+1;
		int ty2 = ty+1;

		m+="D";

		for(int i = sx; i < tx2 ; i++){
			m+="R";
		}
		for(int i = sy2; i < ty ; i++){
			m+="U";
		}
		m+="LU";
		for(int i = sx2; i < tx ; i++){
			m+="L";
		}
		for(int i = sy; i < ty2 ; i++){
			m+="D";
		}
		m+="R";

		System.out.println(m);
	}
}