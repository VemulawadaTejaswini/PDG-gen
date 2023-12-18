
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}


	public void run() {
		Scanner sc = new Scanner(System.in);
		char s[] = sc.next().toCharArray();
		long k=sc.nextLong();
		char ans  = '1';
		for(int i=0; i<s.length; i++) {
			if(s[i] != '1') {
				if((long)i+1<=k) {
					ans = s[i];
				}
				break;
			}
		}
		System.out.println(ans);
		sc.close();
	}


}
