import java.util.Scanner;

public class Main {

	public static int seach_AC (String s) {
		int result = 0;
		if(s.length() <= 1) {
			return 0;
		}
			for(int i = 0; i < s.length()-1; i++) {
				if(s.substring(i,i+2).equals("AC")) {
					result++;
				}
			}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		String s = sc.next();
		System.out.println("");
		for(int i = 0; i < q; i++) {
			int r = sc.nextInt();
			int l = sc.nextInt();
			System.out.println(seach_AC(s.substring(r-1,l)));
		}
		sc.close();
	}

}
