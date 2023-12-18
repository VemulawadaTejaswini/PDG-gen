
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String s[] = new String[N];
		int count = 0;
		
		for(int i = 0; i < N; i++) {
			s[i] = sc.next();
			char[] c = s[i].toCharArray();
			Arrays.sort(c);
			s[i] = new String(c);
		}
		
		for(int i=0 ; i < N; i++) {
			for(int j =i+1 ; j < N ; j++) {
				if(s[i].equals(s[j])) {
					count++;
				}
			}
		}
		System.out.print(count);
	}
}