import java.util.Scanner;

public class Main {

	public static int seach_AC (String s,int start,int end) {
		int result = 0;
			for(int i = start; i < end; i++) {
				if(s.substring(i,i+2).equals("AC")) {
					i++;
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
			System.out.println(seach_AC(s,r-1,l-1));
		}
		sc.close();
	}
}
