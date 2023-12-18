import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long h=scan.nextLong();
		long w=scan.nextLong();
		scan.close();

		long ans = 0;
		if(w % 2==0) {
			ans = (w/2)*h;
		}else {
			if(h%2==0)ans = (w/2)*h/2 + (w/2+1)*h/2;
			else ans = (w/2)*h/2 + (w/2+1)*(h/2+1);
		}
		if(h==1|| w==1)ans=1;
		System.out.println(ans);
	}

}