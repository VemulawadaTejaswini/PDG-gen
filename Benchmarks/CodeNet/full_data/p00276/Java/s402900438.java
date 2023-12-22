
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		for(int i = 0 ; i < q ;i++) {
			int c = scan.nextInt();
			int a = scan.nextInt();
			int n =scan.nextInt();
			int cun = 0;
			while(true) {
				if(c >0 && a > 0 && n >0) {
					++cun;
					--c;
					--a;
					--n;
				}else if(c >1 && a > 0) {
					++cun;
					c = c-2;
					--a;
				}else if(c > 2) {
					++cun;
					c =c-3;
				}else {
					break;
				}
			}
			System.out.println(cun);
		}
	}
}

