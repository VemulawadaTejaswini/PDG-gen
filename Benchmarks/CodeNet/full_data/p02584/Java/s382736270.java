
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String L = scan.nextLine();
		String[] l = L.split(" ");
		long x = Long.parseLong(l[0]);
		long k = Long.parseLong(l[1]);
		long d = Long.parseLong(l[2]);
		long ans = x;

		if(k*d<x) {
			ans = x - k*d;
			System.out.println(ans);
		}else{
			int count = 0;
			while(ans>0) {
				ans -= d;
				count++;
			}
			if((k-count)%2 == 1) {
				ans += d;
				System.out.println(ans);
			}else {
				System.out.println(-ans);
			}
		}


		scan.close();


	}

}
