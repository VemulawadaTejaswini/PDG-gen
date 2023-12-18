import java.util.Scanner;
public class Main {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int d,n;
			d=scan.nextInt();
			n=scan.nextInt();

			int cnt=0;
			for(int i=1;;i++) {
				if(func(i)==d) {
					cnt++;
					if(cnt==n) {
						System.out.println(i);
						break;
					}
				}
			}
		}

		static int func(int x) {
			if(x%100!=0)return 0;
			return func(x/100)+1;
		}
}