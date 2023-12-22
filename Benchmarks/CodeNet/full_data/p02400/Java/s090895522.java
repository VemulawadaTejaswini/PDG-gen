import java.util.Scanner;


class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		
		double s = r * r * 3.141592;
		double t = 2 * r * 3.141592;
		
		String S = String.format("%.6f",s);
		String T = String.format("%.6f",t);
		
		System.out.println(S + " " + T);
		
	}

}