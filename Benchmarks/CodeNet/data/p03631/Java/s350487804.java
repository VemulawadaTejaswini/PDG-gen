import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		System.out.println(paliNum(N));
	}
	
	static String paliNum(int N) {
		String n = Integer.toString(N);
		int len = n.length();
		for(int i=0; i<=len/2-1; i++) {
			if(n.charAt(i) != n.charAt(len-1-i)) return "No";
		}
		return "Yes";
	}
	
}
