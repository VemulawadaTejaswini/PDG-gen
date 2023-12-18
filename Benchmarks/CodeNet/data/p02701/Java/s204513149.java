import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] s = new String[n];
		int count = 0;
		boolean b;
		
		for(int i=0;i<n;i++) {
			s[i] = scan.next();
		}
		
		Arrays.sort(s);
		
		for(int i=0;i<n-1;i++) {
			b = s[i].equals(s[i+1]);
			if(!b) {
				count++;
				if(i == n-2) {
					count++;
				}
			}
		}
		if(count == 0) {
			count++;
		}
		System.out.println(count);

	}

}