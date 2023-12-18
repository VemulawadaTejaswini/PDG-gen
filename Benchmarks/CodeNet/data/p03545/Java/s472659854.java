import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ABCD = sc.next();
		int A = Integer.parseInt(ABCD.substring(0, 1));
		int B = Integer.parseInt(ABCD.substring(1, 2));
		int C = Integer.parseInt(ABCD.substring(2, 3));
		int D = Integer.parseInt(ABCD.substring(3, 4));
		String res = solve(A,B,C,D);
		System.out.println(res);
	}

	private static String solve(int A,int B,int C,int D) {
		if(A+B+C+D==7) {
			return A+"+"+B+"+"+C+"+"+D+"=7";
		}else if(A-B+C+D==7) {
			return A+"-"+B+"+"+C+"+"+D+"=7";
		}else if(A-B-C+D==7) {
			return A+"-"+B+"-"+C+"+"+D+"=7";
		}else if(A-B-C-D==7) {
			return A+"-"+B+"-"+C+"-"+D+"=7";
		}else if(A-B+C-D==7) {
			return A+"-"+B+"+"+C+"-"+D+"=7";
		}else if(A+B-C+D==7) {
			return A+"+"+B+"-"+C+"+"+D+"=7";
		}else if(A+B-C-D==7) {
			return A+"+"+B+"-"+C+"-"+D+"=7";
		}else if(A+B+C-D==7) {
			return A+"+"+B+"+"+C+"-"+D+"=7";
		}else {
			return A+"+"+B+"+"+C+"+"+D+"=7";
		}
	}

}
