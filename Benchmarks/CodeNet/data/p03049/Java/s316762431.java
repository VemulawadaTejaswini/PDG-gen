import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		int n = sc.nextInt();
		String[] strs = new String[n];
		int res = 0;
		int startB = 0;
		int endA = 0;
		for(int i=0; i<n; i++) {
			strs[i] = sc.next();
			if(strs[i].contains("AB")) {
				res++;
			}
			if(strs[i].startsWith("B")) {
				startB++;
			}
			if(strs[i].endsWith("A")) {
				endA++;
			}
		}
		int min = Math.min(startB, endA);
		System.out.println(min+res);
	}
}
