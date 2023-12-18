import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Integer []s = new Integer [n];
		int all = 0;
		
		for(int i = 0; i < n;i++) {
			s[i] = sc.nextInt();
			all += s[i];
		}
		Arrays.sort(s);
		
		int max = all;
		for(int i= 0; i < n ;i++) {
			if(max % 10 == 0) {
				max = max - s[i];
			}
			else {
				break;
			}
			
		}
		System.out.println(max);
	}

}
