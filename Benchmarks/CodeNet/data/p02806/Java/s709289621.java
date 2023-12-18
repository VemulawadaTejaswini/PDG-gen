import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		String [] s = new String[n];
		int[] t = new int[n];
		
		for(int i = 0; i < n; i++) {
			s[i] = stdIn.next();
			t[i] = stdIn.nextInt();
		}
		String x = stdIn.next();
		
		int index = 0;
		for(int i = 0; i < n; i++) {
			if(x.equals(s[i])) {
				index = i;
			}
		}
		int sum = 0;
		for(int i = index+1; i < n; i++) {
			sum += t[i];
		}
		System.out.println(sum);
		
		
	}

}
