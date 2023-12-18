import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		long cnt = 0;
		
		
		for(int i = 1; i <= n; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
			}else if(i % 3 == 0) {
			}else if(i % 5 == 0) {
			}else {
				cnt += i;
			}
		}
		
		System.out.println(cnt);
		
		
	}

}
