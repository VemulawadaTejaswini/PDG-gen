import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		int c = scan.nextInt();
		String s = scan.next();
		
		int[] left = new int[n];
		for(int i = 0; i < n; i++){
			if(s.charAt(i) != 'x') {
				left[i] = i+1;
				i += c;
			}
		}
		
		int[] right = new int[n];
		for(int i = n-1; i >= 0; i--) {
			if(s.charAt(i) != 'x') {
				right[i] = i+1;
				i -= c;
			}
		}
		
		for(int i = 0; i < n; i++) {
			if(left[i] == right[i] && left[i] == i+1)
				System.out.println(i+1);
		}
	}
}