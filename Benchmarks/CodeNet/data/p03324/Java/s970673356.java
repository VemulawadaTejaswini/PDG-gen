
import java.util.Scanner;
public class Main {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int d,n,cnt=0;
			d=scan.nextInt();
			n=scan.nextInt();

			if(d==0)System.out.println(n);
			if(d==1)System.out.println(n*100);
			if(d==2)System.out.println(n*10000);
			scan.close();
		}
}